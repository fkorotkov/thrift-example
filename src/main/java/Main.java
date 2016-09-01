import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TCompactProtocol;

public class Main {
    public static void main(String... args) throws TException {
        final TSerializer serializer = new TSerializer(new TCompactProtocol.Factory());

        Foo foo = new Foo();
        foo.setId(1);
        System.out.println(serializer.serialize(foo));

        FooPrivateMembers fooPrivateMembers = new FooPrivateMembers();
        fooPrivateMembers.setId(1);
        System.out.println(serializer.serialize(fooPrivateMembers));

        FooBeans fooBeans = new FooBeans();
        fooBeans.setId(1);
        System.out.println(serializer.serialize(fooBeans)); // throws Required field 'num' is unset! Struct:FooBeans(id:1, num:0)
    }
}
