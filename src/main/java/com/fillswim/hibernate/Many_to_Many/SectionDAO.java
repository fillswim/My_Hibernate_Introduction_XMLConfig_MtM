package com.fillswim.hibernate.Many_to_Many;

import com.fillswim.hibernate.Many_to_Many.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SectionDAO {

    // Сохранение данных
    public void saveSection(Section section) {

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            session.merge(section);
            transaction.commit();
        }
    }

    // Получение информации о секции
    public Section getSection(int id) {
        Section section;

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            section = session.get(Section.class, id);
            transaction.commit();
        }

        return section;
    }

    // Удаление секции
    public void deleteSection(int id) {

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            Section section = session.get(Section.class, id);
            session.delete(section);
            transaction.commit();
        }
    }

}
