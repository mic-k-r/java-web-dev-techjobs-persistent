package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotEmpty(message = "Description is required.")
    @Size(min=3, max=500, message = "Description must have between 3 and 500 characters.")
    private String description;

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}