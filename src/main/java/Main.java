import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TCompactProtocol;

public class Main {
    public static void main(String... args) throws TException {
        final TSerializer serializer = new TSerializer(new TCompactProtocol.Factory());

        Foo foo = new Foo();
        foo.setId(1);
        serializer.serialize(foo);

        FooBean fooBean = new FooBean();
        fooBean.setId(1);
        serializer.serialize(fooBean);

        FooPrivateMembers fooPrivateMembers = new FooPrivateMembers();
        fooPrivateMembers.setId(1);
        serializer.serialize(fooPrivateMembers);
    }
}
