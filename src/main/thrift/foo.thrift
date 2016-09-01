// to generate: thrift --gen java -out src/main/java/ src/main/thrift/foo.thrift
struct Foo {
  1: required i32 id;
  2: required i32 num;
}