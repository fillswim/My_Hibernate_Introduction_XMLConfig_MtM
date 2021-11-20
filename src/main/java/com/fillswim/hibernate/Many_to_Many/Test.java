package com.fillswim.hibernate.Many_to_Many;

import com.fillswim.hibernate.Many_to_Many.Entity.Child;
import com.fillswim.hibernate.Many_to_Many.Entity.Section;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        SectionDAO sectionDAO = new SectionDAO();
        ChildrenDAO childrenDAO = new ChildrenDAO();

        // Сохранение новой секции с детьми в ней
//        Child child1 = new Child("Pete", 10);
//        Child child2 = new Child("Nina", 15);
//        Child child3 = new Child("Nick", 13);
//
//        Section section = new Section("Chess");
//
//        section.addChildToSection(child1);
//        section.addChildToSection(child2);
//        section.addChildToSection(child3);
//
//        sectionDAO.saveSection(section);

        // Сохранение ребенка и секция, в которые ох ходит
//        Child child = new Child("Rose", 14);
//
//        Section section1 = new Section("Football");
//        Section section2 = new Section("Tennis");
//        Section section3 = new Section("Swimming");
//
//        child.addSectionToChild(section1);
//        child.addSectionToChild(section2);
//        child.addSectionToChild(section3);
//
//        childrenDAO.saveChild(child);

        // Изменение секции
//        Section section = sectionDAO.getSection(1);
//        System.out.println(section);
//        section.setName("Math");
//        System.out.println(section);
//        sectionDAO.saveSection(section);


        // Получение информации о секции и о детях, которые в ней занимаются
//        Section section = sectionDAO.getSection(1);
//        List<Child> children = section.getChildren();
//        for (Child child : children) {
//            System.out.println(child);
//        }

        // Получение информации и ребенке и о секциях, которые он посещает
//        Child child = childrenDAO.getChild(4);
//        List<Section> sections = child.getSections();
//
//        for (Section section : sections) {
//            System.out.println(section);
//        }

        // Удаление секции
//        sectionDAO.deleteSection(2);

        // Удаление информации о ребенке
//        childrenDAO.deleteChild(1);
    }
}
