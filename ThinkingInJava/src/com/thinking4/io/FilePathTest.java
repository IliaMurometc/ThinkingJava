package com.thinking4.io;

import java.io.File;

import org.eclipse.swt.internal.Platform;
/*
 * ��Ҫ��Ϊ�˲���Java���˰�֮�������ļ��е�·����Ϣ
 * */
public class FilePathTest {
    public static void main(String[] args) throws Exception {
    	String packagePath = FilePathTest.class.getPackage().getName().replace('.', '/');
    	System.out.println(packagePath);
    	//file:/D:/Workspace/JavaThinking/JavaThinking/bin/
        System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
        ///D:/Workspace/JavaThinking/JavaThinking/bin/
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath());
        //null
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("/"));
        //file:/D:/Workspace/JavaThinking/JavaThinking/bin/
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("./"));
        //null
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("../"));
        //null
        System.out.println(Thread.currentThread().getContextClassLoader().getResource(".."));
        //file:/D:/Workspace/JavaThinking/JavaThinking/bin/
        System.out.println(ClassLoader.getSystemResource("")); 
        //null
        System.out.println(ClassLoader.getSystemResource("/"));
        //null
        System.out.println(ClassLoader.getSystemResource("../"));
        //file:/D:/Workspace/JavaThinking/JavaThinking/bin/
        System.out.println(FilePathTest.class.getClassLoader().getResource(""));
        //file:/D:/Workspace/JavaThinking/JavaThinking/bin/com/thinking4/io/
        System.out.println(FilePathTest.class.getResource(""));  
        //file:/D:/Workspace/JavaThinking/JavaThinking/bin/
        System.out.println(FilePathTest.class.getResource("/"));
        //D:\
        System.out.println(new File("/").getAbsolutePath());
        //D:\Workspace\JavaThinking\JavaThinking
        System.out.println(new File("").getAbsolutePath());
        //D:\Workspace\JavaThinking\JavaThinking
        System.out.println(System.getProperty("user.dir")); 
        
//        java.net.URL url = FilePathTest.class.getResource(""); // ClassNameΪ�������������� 
//        String pathPrefix = url.getPath();//.substring(); // �ַ�����ȡ 
//        String url = FilePathTest.class.getClassLoader().getResource(".").getPath();
//        url = java.net.URLDecoder.decode(url,"utf-8");
//        System.out.println(url);
    }  
}
