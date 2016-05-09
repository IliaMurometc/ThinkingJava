Chapter 4. Database Programming 
	���ݿ���
	com.thinking.database
	
TestDB.java
database.properties

ExecSQL.java
	��װ���ݿ�
	
QueryDB.java
	ִ�в�ѯ����
	PreparedStatement
	
�ɹ����Ϳɸ��µĽ����( Scrollable and Updatable Result Sets )
	�ɹ����Ľ����( Scrollable Result Sets )
		Statement stat = conn.createStatement(type, concurrency);
		PreparedStatement stat = conn.prepareStatement(command, type, concurrency);
		
		ResultSet Type Values 
		TYPE_FORWARD_ONLY			The result set is not scrollable.
 		TYPE_SCROLL_INSENSITIVE		The result set is scrollable but not sensitive to database changes.
 		TYPE_SCROLL_SENSITIVE		The result set is scrollable and sensitive to database changes.
 		
 		ResultSet Concurrency Values 
 		CONCUR_READ_ONLY			The result set cannot be used to update the database.
 		CONCUR_UPDATABLE			The result set can be used to update the database.
 	
 	�ɸ��µĽ����( Updatable Result Sets )
		Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		String query = "SELECT * FROM Books";
		ResultSet rs = stat.executeQuery(query);
		while (rs.next())
		{
		   if (. . .)
		   {
		      double increase = . . .
		      double price = rs.getDouble("Price");
		      rs.updateDouble("Price", price + increase);
		      rs.updateRow();//������ã���izesuoyou�ĸ�����Ϣ�������м�����
		   }
		}

		//������
		rs.moveToInsertRow();
		rs.updateString("Title", title);
		rs.updateString("ISBN", isbn);
		rs.updateString("Publisher_Id", pubid);
		rs.updateDouble("Price", price);
		rs.insertRow();
		rs.moveToCurrentRow();

		//ɾ����
		rs.deleteRow();

Ԫ����( Metadata )
	�������ݿ��Ԫ����(about a database)
		DatabaseMetaData meta = conn.getMetaData();
		ResultSet mrs = meta.getTables(null, null, null, new String[] { "TABLE" });
		
	���ڽ������Ԫ����(about a result set)
		ResultSet mrs = stat.executeQuery("SELECT * FROM " + tableName);
		ResultSetMetaData meta = mrs.getMetaData();
		for (int i = 1; i <= meta.getColumnCount(); i++)
		{
		   String columnName = meta.getColumnLabel(i);
		   int columnWidth = meta.getColumnDisplaySize(i);
		   JLabel l = new Label (columnName);
		   JTextField tf = new TextField (columnWidth);
		   . . .
		}
	
	����Ԥ����������Ԫ����(about parameters of prepared statements)
	
ViewDB.java
	Ԫ���ݼ���
		
RowSetTest.java
	�м�
	�ɹ����Ľ�������������û����������������У�����ʼ�������ݿⱣ������
	�м�RowSet�̳���ResultSet�ӿڣ�������ʼ�ձ��������ݿ������
	CachedRowSet
		allows disconnected operation

	ResultSet result = stat.executeQuery(queryString);
	CachedRowSet rowset = new com.sun.rowset.CachedRowSetImpl();
	   // or use an implementation from your database vendor
	rowset.populate(result);
	conn.close(); // now ok to close the database connection
	
	//establish a db connection
	rowset.setURL("jdbc:mckoi://localhost/");
	rowset.setUsername("dbuser");
	rowset.setPassword("secret");
	rowset.setCommand("SELECT * FROM Books");
	rowset.execute();
	rowset.acceptChanges(conn); //���޸�д�����ݿ�
	//rowset.acceptChanges(); //or this statement	
		
	WebRowSet
		is a cached row set that can be saved to an XML file. The XML file can be moved to another tier of a web application, where it is opened by another WebRowSet object.
	FilteredRowSet / JoinRowSet
		interfaces support lightweight operations on row sets that are equivalent to SQL SELECT and JOIN operations. These operations are carried out on the data stored in row sets, without having to make a database connection
	JdbcRowSet 
		is a thin wrapper around a ResultSet. It adds useful getters and setters from the RowSet interface, turning a result set into a "bean." 
	
����( Transactions )
	conn.setAutoCommit(false);
	Statement stat = conn.createStatement();
	stat.executeUpdate(command1);
	stat.executeUpdate(command2);
	stat.executeUpdate(command3);
	. . .
	conn.commit();
	conn.rollback();//if an error occurred, call
	
	//use Save Points
	Statement stat = conn.createStatement(); // start transaction; rollback() goes here
	stat.executeUpdate(command1);
	Savepoint svpt = conn.setSavepoint(); // set savepoint; rollback(svpt) goes here
	stat.executeUpdate(command2);
	if (. . .) conn.rollback(svpt); // undo effect of command2
	. . .
	conn.commit();

	//When you are done with a save point, you should release it:
	stat.releaseSavepoint(svpt);

	//��������( Batch Updates )
	Statement stat = conn.createStatement();
	String command = "CREATE TABLE . . ."
	stat.addBatch(command);
	while (. . .)
	{
	   command = "INSERT INTO . . . VALUES (" + . . . + ")";
	   stat.addBatch(command);
	}
	int[] counts = stat.executeBatch();

LDAP( the Lightweight Directory Access Protocol )
	LDAP is preferred over relational databases when the application data naturally follows a tree structure and when read operations greatly outnumber write operations. 
	LDAP is most commonly used for the storage of directories that contain data such as user names, passwords, and permissions.




	


 
		