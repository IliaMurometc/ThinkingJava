package net.jcip.examples.ch03;

/**
 * NoVisibility
 * <p/>
 * Sharing variables without synchronization
 * ִ�е�ʱ��������: java.lang.UnsupportedClassVersionError: 
 * @author Brian Goetz and Tim Peierls
 */

public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        //���ʱ���ܱ�֤���߳�д��ready��number��ֵ�Զ��߳��ǿɼ���
        number = 42;
        ready = true;
    }
}
