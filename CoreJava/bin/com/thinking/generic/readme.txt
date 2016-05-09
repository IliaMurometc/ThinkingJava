Chapter 13. Generic Programming 
	���ͳ������
	com.thinking.generic

Pair
	������
	
PairTest1
	
PairTest2
	���ͷ���
	T extends Comparable & Serializable
	
���ʹ����������
	�����û�з������Ͷ������ж���������ͨ��
	���е����Ͳ����������ǵı߽��滻
	�ŷ������ϳ�Ϊ���ֶ�̬��
	Ϊ�������Ͱ�ȫ�ԣ���Ҫʱ����ǿ������ת��
	���Ͳ���
	�Զ�����ǿ������ת��
	class DateInterval extends Pair<Date>
	{
	   public void setSecond(Date second){ . . . }
	   . . .
	}
	����Ϊ
	class DateInterval extends Pair // after erasure
	{
	   public void setSecond(Date second) { . . . }
	   . . .
	}
	��2��������
	void setSecond(Date) // defined in DateInterval
	void setSecond(Object) // defined in Pair
	�Žӷ��� (bridge method)
	public void setSecond(Object second) { setSecond((Date) second); }
	
����ʱ���Ͳ�ѯֻ�Ƿ���ԭʼ���ͣ��뷺���޹�

�쳣
	�����׳�Ҳ���ܲ�������Ķ���---��������չThrowable���Ϸ�
	������catch�Ӿ���ʹ�÷��ͱ���
	���쳣�����п���ʹ�÷��ͱ���
	public static <T extends Throwable> void doWork(T t) throws T // OK
	{
	   TRy
	   {
	      do work
	   }
	   catch (Throwable realCause)
	   {
	      t.initCause(realCause);
	      throw t;
	   }
	}
	
����
	�����������������͵�����---����---�������ܹ���ס����Ԫ������
	Pair<String>[] table = new Pair<String>(10); // ERROR
	
����ʵ������������
	public Pair() { first = new T(); second = new T(); } // ERROR
���ܽ���һ����������
	public <T> T[] minMax(T[] a) { T[] mm = new T[2]; . . . } // ERROR
	
�����ھ�̬��򷽷������÷��ͱ���
	public class Singleton<T>
	{
	   public static T getSingleInstance() // ERROR
	   {
	      if (singleInstance == null) construct new instance of T
	      return singleInstance;
	   }
	   private static T singleInstance; // ERROR
	}
	
In general, there is no relationship between Pair<S> and Pair<T>, no matter how S and T are related

Pair<? extends Employee>
	���Դӷ��Ͷ����ȡ
Pair<? super Manager>
	�������Ͷ���д��
Pair<?>
	PairTest3


	