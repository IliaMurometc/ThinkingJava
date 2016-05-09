Chapter 12. XML 
	XML�ĵ�
	com.thinking.xml
	
The Java library supplies two kinds of XML parsers:
	The Document Object Model (DOM) parser reads an XML document into a tree structure.
	The Simple API for XML (SAX) parser generates events as it reads an XML document.

DOMTreeTest.java
server.xml

��֤�ĵ�
	DTD
	XML Schema

GridBagTest.java
GridBagPane.java
gridbag.dtd
fontdialog.xml
	DTD
gridbag.xsd
fontdialog-schema.xml
	XML Schema

XPathTest.java
	ʹ��XPath����λ��Ϣ
	XPathFactory xpfactory = XPathFactory.newInstance();
	XPath path = xpfactory.newXPath();

ʹ�����ֿռ�
	����ط��Ƚ��������
	
SAXTest.java
	ʹ��SAX������
	The ContentHandler interface defines several callback methods that the parser executes as it parses the document.
		startElement and endElement are called when a start tag or end tag is encountered.
		characters is called whenever character data are encountered.
		startDocument and endDocument are called once each, at the start and the end of the document.
		�������̫�����
	
XMLWriteTest.java
	����XML�ĵ�
	XML Style Sheet Transformations (XSLT) 
	// construct the "do nothing" transformation
	Transformer t = TransformerFactory.newInstance().newTransformer();
	// set output properties to get a DOCTYPE node
	t.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, systemIdentifier);
	t.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, publicIdentifier);
	// apply the "do nothing" transformation and send the output to a file
	t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(file)));

TransformTest.java
makeprop.xsl
makehtml.xsl
employee.dat
	XSLת��
	
��׼����һ��demo,�ֱ���
dom4j
dom
sax
���ļ�
	�ڵ�
	����
д�ļ�

	