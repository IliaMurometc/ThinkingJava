package com.thinking4.innerclasses;

//: innerclasses/ClassInInterface.java
// {main: ClassInInterface$Test}

public interface ClassInInterface {
	void howdy();
	//���ﻹ�̳��� ���ӿ�
	class Test implements ClassInInterface {
	//static class Test implements ClassInInterface {
		public void howdy() {
		//�������Ϊʲô�����趨��static��?��Ϊ���ӿڼ̳е�����
		//public static void howdy() {
			System.out.println("Howdy!");
		}

		public static void main(String[] args) {
			new Test().howdy();
			//Test.howdy();
		}
	}
} /*
 * Output: Howdy!
 */// :~
