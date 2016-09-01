// to generate: thrift --gen java:private-members -out src/main/java/ src/main/thrift/foo_private_members.thrift
struct FooBean {
  1: required i32 id;
  2: required i32 num;
}