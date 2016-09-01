// to generate: thrift --gen java:bean -out src/main/java/ src/main/thrift/foo_bean.thrift
struct FooBean {
  1: required i32 id;
  2: required i32 num;
}