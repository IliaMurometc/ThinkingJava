ͼ�ν�����¼�����

ButtonTest
	����ť����¼�
	
PlafTest
	�ı�۸�
	UIManager
	UIManager.LookAndFeelInfo
	UIManager.setLookAndFeel(plafName);
	SwingUtilities.updateComponentTreeUI(PlafPanel.this);
	
awt�¼��̳в��
awt�����¼�:����û��������¼�
	ActionEvent����Ӧ��굥�����˵�ѡ��ѡ���б�����ı��м���enter
	AdjustmentEvent���û����ڹ�����
	ItemEvent���û��Ӹ�ѡ����б��ѡ��һ��
awt�ͼ��¼�:�γ���Щ�¼����¼�
	���еͼ��¼����̳�ComponentEvent
	KeyEvent
	MouseEvent
	MouseWheelEvent
	FocusEvent
	WindowEvent
	
Sketch
	�����¼�
	Java��ȷ�����ַ����������
	keyPressed		��ȡ���¼��̵��¼�
	keyReleased		��ȡ�ɿ����̵��¼�
	keyTyped		�����û��û��������������ַ�
	
MouseTest
	����¼�
	���û��������ʱ�򣬽������3������������
		1.��һ�ΰ���ʱ�����mousePressed
		2.����ͷ�ʱ����mouseReleased
		3.������mouseClicked
	
ActionTest
	����
	�����¼�Դ��ͬһ����������
	
MulticastTest
	��㴫��
	������������ͬһ���¼�Դ����
	Close All��ť�ж��������
		
EventSourceTest
	ʵ���¼�Դ
	Frame����״�ı�������Ӧ
	�¼�����״�ı�
	��Ӧ���ı�Title����ʾֵ
	�����¼�Դ3Ҫ��
		1.�¼�����
			PropertyChangeEvent
		2.�¼������ӿ�
			PropertyChangeListener
		3.���ӻ�ɾ���������ķ���
			addPropertyChangeListener(PropertyChangeListener)
			removePropertyChangeListener(PropertyChangeListener)
	������ӱȽ����Ѷ�
	