������: ջ
edu.colorado.ch06.stack
	�Ƚ����LaterInFirstOut LIFO
	���ݲ����ɾ��ֻ��һ��(ջ��)����
	java.util.Stack
	IsBalancedDemonstration
		���ŵ�ƽ��
	EvaluateDemonstration
		�������ʽ��ֵ
		ʹ����2��ջ:
			1. �ַ�ջ
			2. ˫����ʵ�����ɵ�ջ
		������������Ǹ�
		������ʽ�ĸ�ʽ����ȷ��
		������ʽ��ȫ������,��ֻʹ��(��)
	ջADT��ʵ��
		1. ʹ������	ArrayStack
		2. ʹ������	LinkedStack
		
Stack��������
	push()
	pop()
	peek()
	
ArrayStack
	
LinkedStack
   public void push(E item)
   {
      top = new Node<E>(item, top);
   }
   
DerivedStack
	ʹ��LinkedSeq������ջ


	�����ӵ�ջӦ��
	�����ת�����ʽ��ջ���͵�Ӧ��