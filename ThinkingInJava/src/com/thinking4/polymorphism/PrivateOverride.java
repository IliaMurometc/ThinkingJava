package com.thinking4.polymorphism;
//: polymorphism/PrivateOverride.java
// Trying to override a private method.
import static com.thinking4.util.Print.*;
//���е�private����Ĭ�϶���final�ģ����ɼ̳�
//����ڸ�������һ���Ķ��壬�൱�����ض��壬������д
public class PrivateOverride {
  private void f() { print("private f()"); }
  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
  }
}

class Derived extends PrivateOverride {
  public void f() { print("public f()"); }
} /* Output:
private f()
*///:~
