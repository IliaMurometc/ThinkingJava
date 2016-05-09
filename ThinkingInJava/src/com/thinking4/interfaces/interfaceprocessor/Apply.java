//: interfaces/interfaceprocessor/Apply.java
package com.thinking4.interfaces.interfaceprocessor;
import static com.thinking4.util.Print.*;
/*
 * �ο�com.thinking4.interfaces.classprocessor.Apply��
 * �������޷��޸�Apply�ķ�������
 * public static void process(Filter p, Object s)
 * ������ȴ�����Filter��process������ʱ�����ǻ�����һ����������ȥ����Filter��
 * */
public class Apply {
  public static void process(Processor p, Object s) {
    print("Using Processor " + p.name());
    print(p.process(s));
  }
} ///:~
