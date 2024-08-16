package com.github.raghav;

import java.util.Collection;
import java.util.Iterator;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

public class Main {
    public static void main(String[] args) {
        System.out.println("DataNucleus TestCase : BugReprSampleCode");
        System.out.println("===================================");
        PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("JdoExample");
        PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx = pm.currentTransaction();
        try {
            tx.begin();
            Product prod1 = new Product(1, "Laptop", "An electronic Device");
            Product prod2 = new Product(2, "Chair", "Furniture");
            Person per1 = new Person( "ABC", 30, "III");
            Person per2 = new Person("DEF", 56, "UUU");
            pm.makePersistent(prod1);
            pm.makePersistent(prod2);
            pm.makePersistent(per1);
            pm.makePersistent(per2);
            tx.commit();
        }
        catch(Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        finally {
            if(tx.isActive())
                tx.rollback();

            pm.close();
        }
    }
}
