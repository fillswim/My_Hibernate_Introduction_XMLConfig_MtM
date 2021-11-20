package com.fillswim.hibernate.Many_to_Many;

import com.fillswim.hibernate.Many_to_Many.Entity.Child;
import com.fillswim.hibernate.Many_to_Many.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ChildrenDAO {

    // Сохранение данных
    public void saveChild(Child child) {

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            session.merge(child);
            transaction.commit();
        }
    }

    // Получение информации и ребенке
    public Child getChild(int id) {

        Child child;

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            child = session.get(Child.class, id);
            transaction.commit();
        }

        return child;
    }

    // Удаление информации и ребенке
    public void deleteChild(int id) {
        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            Child child = session.get(Child.class, id);
            session.delete(child);
            transaction.commit();
        }
    }

}
