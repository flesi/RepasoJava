package sql;

public class sql {

	//	The SELECT statement is used to select data from a database.
//	SELECT column1, column2, ...
//	FROM table_name;
	
	
	//	The WHERE clause is used to filter records.
//	SELECT column1, column2, ...
//	FROM table_name
//	WHERE condition;
	
	
	//	The AND operator displays a record if all the conditions separated by AND are TRUE
//	SELECT column1, column2, ...
//	FROM table_name
//	WHERE condition1 AND condition2 AND condition3 ...;
	
	
	//	The OR operator displays a record if any of the conditions separated by OR is TRUE.
//	SELECT column1, column2, ...
//	FROM table_name
//	WHERE condition1 OR condition2 OR condition3 ...;
	
	
	//	The NOT operator displays a record if the condition(s) is NOT TRUE.
//	SELECT column1, column2, ...
//	FROM table_name
//	WHERE NOT condition;
	
	
	//	The ORDER BY keyword is used to sort the result-set in ascending or descending order.
	//	The ORDER BY keyword sorts the records in ascending order by default. To sort the records in descending order, use the DESC keyword.
//	SELECT column1, column2, ...
//	FROM table_name
//	ORDER BY column1, column2, ... ASC|DESC;
	
	
	//	The INSERT INTO statement is used to insert new records in a table.
//	INSERT INTO table_name (column1, column2, column3, ...)
//	VALUES (value1, value2, value3, ...);
	
	
	//	The UPDATE statement is used to modify the existing records in a table.
//	UPDATE table_name
//	SET column1 = value1, column2 = value2, ...
//	WHERE condition;
	
	//	The DELETE statement is used to delete existing records in a table.
//	DELETE FROM table_name WHERE condition;

	
	//	The INNER JOIN keyword selects records that have matching values in both tables.
//	SELECT column_name(s)
//	FROM table1
//	INNER JOIN table2
//	ON table1.column_name = table2.column_name;
	
	
//******************************
	
	
	//	The MIN() function returns the smallest value of the selected column.
//	SELECT MIN(column_name)
//	FROM table_name
//	WHERE condition;
	
	
	//	The MAX() function returns the largest value of the selected column.
//	SELECT MAX(column_name)
//	FROM table_name
//	WHERE condition;
	
	
	//	The COUNT() function returns the number of rows that matches a specified criterion.
//	SELECT COUNT(column_name)
//	FROM table_name
//	WHERE condition;
	
	
	//	The AVG() function returns the average value of a numeric column.
//	SELECT AVG(column_name)
//	FROM table_name
//	WHERE condition;
	
	
	//	The SUM() function returns the total sum of a numeric column. 	
//	SELECT SUM(column_name)
//	FROM table_name
//	WHERE condition;
}
