// to generate: thrift --gen java:beans -out src/main/java/ src/main/thrift/foo_bean.thrift
struct FooBeans {
  1: required i32 id;
  2: required i32 num;
}