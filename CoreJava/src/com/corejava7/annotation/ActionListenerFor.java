package com.corejava7.annotation;

import java.lang.annotation.*;

//ָʾע�����������õĳ���Ԫ�ص�����
@Target(ElementType.METHOD)
//ָʾע�����͵�ע��Ҫ������� CLASS/NTIME/SOURCE
@Retention(RetentionPolicy.RUNTIME)
public @interface ActionListenerFor
{
   String source();
}
