�������  ���� ����С�����շ��أ�
ע�⣬���������϶�����С���շѻ��ǽ����ǰ�������

��һ�֣������д�С��������ֻ�ܸ������ϵĴ�С��������

����Ǽ��˴���С��֮��ĵ�һ���������(��James ZOU�ṩ)

1. Beverage�м������size��get/set����
2. ��װ������Ϲ��췽��
	public DarkRoast(CofeSize size) {
		description = "Dark Roast Coffee:" + size;
		setSize(size);
	}	
3. װ����Ĺ��췽���ı�
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		this.setSize( beverage.getSize() );//ע�⣬����ı���
	}
4. �������������۸񣬸�дcost����

	ϰ������ᵽ�˸��õĽ��������������CofeSize��ö���ͣ����ǽ���д��Beverage����
	static final int TALL = 1 ;
	static final int GRANDE = 2 ;
	static final int VENTI = 3 ;
