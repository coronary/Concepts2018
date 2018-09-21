public class upcast {
  static class A           { int x; }
  static class B extends A { int y; }

  void f (B p) {
    A q = p;
  }
}
