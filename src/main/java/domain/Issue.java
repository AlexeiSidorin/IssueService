package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Issue {

    private int id;
    private String name;
    private String description;
    private boolean isProcess = true;

    private Collection<Person> author = new ArrayList<>();
    private Collection<Label> labels = new HashSet<>();
    private Collection<Assignee> assignees = new ArrayList<>();






}
