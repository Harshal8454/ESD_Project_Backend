-- Adding foreign key constraint to Employee table
ALTER TABLE employee
    ADD CONSTRAINT fk_department
        FOREIGN KEY (department) REFERENCES department(department_id);

-- Adding foreign key constraint to PlacementFilter table
ALTER TABLE placement_filter
    ADD CONSTRAINT fk_placement
        FOREIGN KEY (placement_id) REFERENCES placement(id);

ALTER TABLE placement_filter
    ADD CONSTRAINT fk_specialization
        FOREIGN KEY (specialization) REFERENCES specialization(specialization_id);

ALTER TABLE placement_filter
    ADD CONSTRAINT fk_domain
        FOREIGN KEY (domain) REFERENCES domain(domain_id);
