package com.xjd.hibernateTest.main;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.xjd.hibernateTest.test.UserEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.List;

/**
 * Created by Administrator on 2018/2/5.
 */
public class MainClass {
    public static void main(String[] args) {
        String cfgFile = "hibernate.cfg.xml";
        Configuration conf = new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        tx.begin();
        UserEntity user = (UserEntity) session.get(UserEntity.class, 1);
       // List<UserEntity> list = query.list();
        System.out.println(user.getPassword());
        UserEntity user1 = (UserEntity) session.get(UserEntity.class, 1);
        // List<UserEntity> list = query.list();
        System.out.println(user1.getPassword());
        tx.commit();
        session.close();
    }
}
