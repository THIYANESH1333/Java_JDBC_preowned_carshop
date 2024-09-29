package com.thiyaneshcarshop;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class inventory {
private List<cars> products;
public inventory() {
this.products = new ArrayList<>();
    }
public void addProduct(cars product) {
//products.add(product);
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	boolean sts=false;
	try
	{
		Connection con=db.getDBConnection();
		stmt=con.createStatement();
	    int count=stmt.executeUpdate("insert into cars(brand,"
	    		+ "name1,price,milage) values('"+product.getBrand()+"','"+product.getName1()+"','"+product.getPrice()+"','"+product.getMilage()+"')");
		System.out.println("INSERTED SUCCESFULLY");
    }
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
}
public void updateProduct(cars cs) {
/*if (index >= 0 && index <products.size()) {
products.set(index, updatedProduct);
        } else {
System.out.println("Invalid index. No product updated.");
        }
    }*/
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	boolean sts=false;
	try {
		Connection con=db.getDBConnection();
		con=db.getDBConnection();
		stmt=con.createStatement();
		int count = stmt.executeUpdate("UPDATE cars SET name1='" + cs.getName1() + "', price=" + cs.getPrice() + " WHERE id=" + cs.getId());
		System.out.println("UPDATED SUCCESSFULLY");

	  }
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
}
	
public void removeProduct(int cariddelete) {
/*if (index >= 0 && index <products.size()) {
products.remove(index);
        } else {
System.out.println("Invalid index. No product removed.");
        }
    }*/
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	boolean sts=false;
	try
	{
		Connection con=db.getDBConnection();
		con=db.getDBConnection();
		stmt=con.createStatement();
		int count=stmt.executeUpdate("DELETE from cars WHERE id="+cariddelete);
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
}
	
	
public cars findBrand(String brand) {
for (cars product : products) {
if (product.getBrand() == brand) {
return product;
            }
        }
return null; 
    }
public void showAllProducts()
{
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	Connection con;
	try
	{
		con=db.getDBConnection();
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from cars");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getInt(4)+"    "+rs.getInt(5));
			
		}
	}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
/*{
for (cars product : products) {
System.out.println(product);
        }
    }*/
public List<cars>getProducts() {
return products;
    }
public List<cars> getBrand() {
	// TODO Auto-generated method stub
	return null;
}
}
