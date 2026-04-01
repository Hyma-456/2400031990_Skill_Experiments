package com.klef.fsad.skill_2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session =factory.openSession();
        Transaction tx =session.beginTransaction();
        
        //insert or create
        Product p =new Product();
        
        p.setName("mobile");
        p.setDescription("mobile type is 5g");
        p.setPrice(150.23);
        p.setQuantity(1);
        //p.setId(2);
        p.setName("laptop");
        p.setDescription("laptop type is hp");
        p.setPrice(1500.23);
        p.setQuantity(2);
        session.save(p);
        tx.commit();
        System.out.println("record inserted successfully");
        p.setName("tv");
        p.setDescription("tv type is android");
        p.setPrice(150.23);
        p.setQuantity(1);
        //Retrieve
        /*Product p1 =session.find(Product.class, 2);
        System.out.println("Records retrived successfully");*/
        //update
        
        /*	Product p2 =session.find(Product.class, 2);
        	p2.setDescription("laptop type is dell");
        session.update(p2);
        
        tx.commit();
        System.out.println("updation completed successfully");
        session.close();*/
        //delete
        /*Product p3=session.find(Product.class, 1);
        session.delete(p3);
        tx.commit();
        System.out.println("Deleted");*/
        
    }
}