Chapter 10. Deploying Applets and Applications
	����applet��Ӧ�ó���
	com.thinking.applet
	
NotHelloWorldApplet
NotHelloWorldApplet.html
	һ���򵥵�applet
	���а���applet����������һֱ�ò������
	
CalculatorPanel
CalculatorApplet
CalculatorApplet.html
	��Ӧ�ó���ת��Ϊapplet
	
	
applet��������
	init
		ֻ����һ��
	start
		�ɵ��ö��
	stop
		�ɵ��ö��
	destory
		����������ر�ʱ�Ż����
	
CalculatorPanel	
PopupCalculatorApplet
PopupCalculatorApplet.html
	applet�ĵ���ʽ����
	
���ڱ����applet����
	codebase
	archive
	object
		ָ���������л�applet������ļ�������
		ʹ���������ʱ��init���������ã���start��������
		���Իָ����ϴ�������ر�ʱ��״̬
		
Chart
Chart.html
	ʹ�ò�����applet������Ϣ
	ֻ����applet�е�init�����е���getParameter�������������ڹ������е���
	��applet������ִ��ʱ��������û׼����
	name

applet������
	getAppletContext()
	һ����ҳ�������applet�������ҳ�а����Ķ��applet������ͬһ��codebase������֮�����ͨ��
	һ��applet������������ҳ�ϵ�appletͨ��
	
Bookmark.java
Bookmark.html
Left.html
Right.html
	��ǩapplet
	
AppletFrame
CalculatorApplet.java
CalculatorAppletApplication.java
CalculatorAppletApplication.html
	����applet������Ӧ�ó���
	AppletStub
	AppletContext
	
jar�ļ�
	archive="*.jar"
�嵥�ļ�
	META_INF/MANIFEST.MF
	
ResourceTest
	��Դ
	
Java Web Start
	1.�����һ������jar�ļ���
	2.����JNLP��ʽ������
	3.����Щ�ļ����õ�web��������
	4.ȷ��web���������ھ���.jnlp��׺���ļ�����һ��application/x-java-jnlp-file��mime��������
Java Web Start��������������
	1.����Calculator.java
	2.׼��Calculator.ml
		Main-Class:Calculator
	3.ʹ�����������jar�ļ�
		jar cvmf Calculator.jar Calculator.mf *.class
	4.׼�������ļ�Calculator.jnlp
	5.%TOMCAT_HOME%/webapps/calculator/WEB-INF/web.xml
	  %TOMCAT_HOME%/webapps/calculator/Calculator.jar
	  %TOMCAT_HOME%/webapps/calculator/Calculator.jnlp
	6.����Tomcat, http://localhost:8080/calculator/Calculator.jnlp
	7.�ٴη���jnlp�ļ���Ӧ�ó���ӻ�����ȡ��

WebStartCalculator.java
WebStartCalculator.jnlp
WebStartCalculator.mf
	JNLP API
	Ҫ����ʹ����JNLP API�ĳ��򣬱�������·���а���jre/lib/javaws.jar
	FileOpenService
	FileSaveService
	PersistenceService
		����Ӧ�ó��򱣴�������������Ϣ
		���ҿ�����Ӧ�ó����´�����ʱȡ��
	
CustomWorld
	Ӧ�ó������õĴ洢
	Properties
	
SystemInfo
	ϵͳ��Ϣ
	
PreferencesTest
	Preferences API

