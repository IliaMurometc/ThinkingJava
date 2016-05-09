Chapter 1. Multithreading 
	���߳�
	com.thinking.multithreading
	
Bounce
	����ʲô���߳�
	��ʾ���������򣬲����ƶ�����ȷ�����Ƿ��ǽ�ڵ���
	
BounceThread
	�ܹ���������
	Runnable
	Thread

�ж��߳�
	Interrupting Threads
	interrupt()�����ж�һ���߳�
	isInterrupted()����߳��Ƿ��ж�
	
�߳�״̬
	New
		new Thread(r)
	Runnable
		t.start()
	Blocked
	Dead

�������߳�Blocked
	��Runnable��Blocked
		1.����sleep����˯��״̬
		2.��I/O������
		3.�ȴ�����
		4.�ȴ���������
		5.suspend	
	
	��Blocked��Runnable
		1.˯�߽���
		2.I/O�������
		3.�����û�ʱ
		4.�õ�����֪ͨ��ʱ
		5.resume��ʱ

���߳�Dead
	1.run���������˳�
	2.stop����ɱ��(�ѹ�ʱ)
	3.��Ϊһ��δ������쳣��ֹ��run������ʹ�߳����
	isAlive()�ж��Ƿ���
		Runnable/Blocked---true
		New/Dead---false
�߳�����
	�߳����ȼ�
	�ػ��߳�
		setDaemon(true)
	�߳���
		ThreadGroup
	δ�����쳣������
		setUncaughtExceptionHandlerΪ�κ�һ���̰߳�װһ��������
		setDefaultUncaughtExceptionHandler
		If you don't install a default handler, the default handler is null. 
		However, if you don't install a handler for an individual thread, the handler is the thread's ThreadGroup object.
		
ͬ��
	Synchronization
	
UnsynchBankTest
	û��ͬ���������ʽ�ת��ģ��

SynchBankTest
	����ReentrantLock����ͬ��
		Lock bankLock = new ReentrantLock();
		bankLock.lock();
		try
		{
		}
		finally
		{
		   bankLock.unlock();
		}
     ��������Condition
		Condition sufficientFunds = bankLock.newCondition();
		sufficientFunds.await();
		sufficientFunds.signalAll();

SynchBankTest
	����synchronized����ʵ��ͬ��
	
ͬ����
	synchronized (obj) // this is the syntax for a synchronized block
	{
	   critical section
	}
	
ͬ������
	�������һ������дֵ��������������������ܻᱻ��һ���߳�����ȡ
	�������һ��������ֵ��������ֵ������ǰ������һ���߳�д��ģ���ʱ��ͱ���ʹ��ͬ��
	
volatile��
	The volatile keyword offers a lock-free mechanism for synchronizing access to an instance field
	In summary, concurrent access to a field is safe in these three conditions:
		The field is volatile.
		The field is final, and it is accessed after the constructor has completed.
		The field access is protected by a lock.

����Deadlocks
	
��ƽFairness
	Lock fairLock = new ReentrantLock(true);
	��ƽ������ͨ��Ҫ���ܶ�
	
�������볬ʱLock Testing and Timeouts
	myLock.tryLock(100, TimeUnit.MILLISECONDS)
	myCondition.await(100, TimeUnit.MILLISECONDS))
	
��д��Read/Write Locks
	ReentrantReadWriteLock
	
	//1.Construct a ReentrantReadWriteLock object:
	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	
	//2.Extract read and write locks
	private Lock readLock = rwl.readLock();
	private Lock writeLock = rwl.writeLock();
	
	//3.Use the read lock in all accessors:
	public double getTotalBalance()
	{
	   readLock.lock();
	   try { . . . }
	   finally { readLock.unlock(); }
	}
	
	//4.Use the write lock in all mutators:
	public void transfer(. . .)
	{
	   writeLock.lock();
	   try { . . . }
	   finally { writeLock.unlock(); }
	}

Deprecate stop and suspend Methods 
	
BlockingQueueTest
	��������
	add/remove/element
		���쳣
	offer/poll/peak
		����true/false/null
	put/take
		����
	BlockingQueue����
		LinkedBlockingQueue
			����������
		ArrayBlockingQueue
			����ʱ�������������ѡ��ƽ����
		PriorityBlockingQueue
		DelayQueue
		
�̰߳�ȫ�ļ���Thread-Safe Collections
	ConcurrentLinkedQueue
	ConcurrentHashMap
	CopyOnWriteArrayList 
	CopyOnWriteArraySet
	
	List synchArrayList = Collections.synchronizedList(new ArrayList());
	Map synchHashMap = Collections.synchronizedMap(new HashMap());
	synchronized (synchHashMap)
	{
	   Iterator iter = synchHashMap.keySet().iterator();
	   while (iter.hasNext()) . . .;
	}


Callable
	��Runnable���ƣ����з���ֵ
	public interface Callable<V>
	{
	   V call() throws Exception;
	}
	
Future
	�����첽����Ľ��
	����ʹ��Future����ʱ����Ϳ�������һ�����㣬�Ѽ�������ĳ�̣߳�Ȼ���ȥ�����Լ�����
	You use a Future object so that you can start a computation, 
	give the result to someone, and forget about it. 
	The owner of the Future object can obtain the result when it is ready.
	
	public interface Future<V>
	{
	   V get() throws . . .;
	   V get(long timeout, TimeUnit unit) throws . . .;
	   void cancel(boolean mayInterrupt);
	   boolean isCancelled();
	   boolean isDone();
	}

FutureTask��װ��
	��Callableת����Future��Runnable,��ΪFutureTaskʵ������2���ӿ�
	Callable<Integer> myComputation = . . .;
	FutureTask<Integer> task = new FutureTask<Integer>(myComputation);
	Thread t = new Thread(task); // it's a Runnable
	t.start();
	. . .
	Integer result = task.get(); // it's a Future

FutureTest
	
ThreadPoolTest
	�̳߳�
	ִ����
	ExecutorService pool = Executors.newCachedThreadPool();
	
Scheduled ExecutionԤ��ִ��
	ScheduledExecutorService��

Controlling Groups of Threads�����߳���

Synchronizersͬ����
	Barriers
		CyclicBarrier
	Countdown Latches����ʱ��˨
		CountDownLatch
	Exchangers
		Exchanger
	Synchronous Queuesͬ������
		SynchronousQueue
	Semaphores
	
AlgorithmAnimation�ź���
	
�߳���swing
	swing�����̰߳�ȫ��
	
SwingWorkerTest
	����crsto10.txt
	