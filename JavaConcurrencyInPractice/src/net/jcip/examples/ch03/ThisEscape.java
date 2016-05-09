package net.jcip.examples.ch03;

/**
 * ThisEscape
 * <p/>
 * Implicitly allowing the this reference to escape
 * �Ƚ�SafeListener
 * @author Brian Goetz and Tim Peierls
 */
public class ThisEscape {
    public ThisEscape(EventSource source) {
        source.registerListener(new EventListener() {
            public void onEvent(Event e) {
            	//��Ϊִ����ThisEscape��ķ���doSomething
            	//���Ե�����EventListener��ʱ��,�൱�ھͷ�����this����
                doSomething(e);
            }
        });
    }

    void doSomething(Event e) {
    }


    interface EventSource {
        void registerListener(EventListener e);
    }

    interface EventListener {
        void onEvent(Event e);
    }

    interface Event {
    }
}

