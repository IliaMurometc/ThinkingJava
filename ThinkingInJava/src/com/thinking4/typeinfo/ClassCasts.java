package com.thinking4.typeinfo;
//: typeinfo/ClassCasts.java

class Building {}
class House extends Building {}
class Test {}

public class ClassCasts {
  public static void main(String[] args) {
    Building b = new House();
    Class<House> houseType = House.class;
    House h = houseType.cast(b);
    h = (House)b; // ... or just do this.
    //����������
    House h2 = (House)b;
    //��һ��������ʲôʱ���õ��أ���ʲô�ô���?
    Test t = new Test();
    //������ͨ��
    Class<House> houseType3 = House.class;
    House h3 = houseType.cast(t);
    //����ͨ����
    //House h4 = (House)t;
  }
} ///:~
