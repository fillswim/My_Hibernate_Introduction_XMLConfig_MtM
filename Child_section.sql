CREATE TABLE my_db.child_section
(
    child_id   int NOT NULL,
    section_id int NOT NULL,
    primary key (child_id, section_id),
    foreign key (child_id) references my_db.children (id),
    foreign key (section_id) references my_db.sections (id)
);

