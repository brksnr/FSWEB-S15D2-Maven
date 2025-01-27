package org.example.entity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks = new HashSet<>();
    private Set<Task> bobsTasks = new HashSet<>();
    private Set<Task> carolsTasks = new HashSet<>();
    private Set<Task> unassignedTasks = new HashSet<>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name){
        switch(name){
            case "ann":
                return this.annsTasks;
            case "bob":
                return this.bobsTasks;
            case "carol":
                return this.carolsTasks;
            case "all":
                return getUnion(bobsTasks, annsTasks,carolsTasks);
            default:
                return null;
        }

    }

    public Set<Task> getUnion(Set<Task>... sets){
    HashSet<Task> allTasks = new LinkedHashSet<>();
    for(Set<Task> tasks : sets){
        allTasks.addAll(tasks);
    }
        return allTasks;
    }

    public Set<Task> getDifferences(Set<Task> first, Set<Task> second){
        Set<Task> diffrenceSet = new HashSet<>(first);
        diffrenceSet.removeAll(second);
        return diffrenceSet;
    }

    public Set<Task> getIntersection(Set<Task> first, Set<Task> second){
        Set<Task> intersectionSet = new HashSet<>(first);
        intersectionSet.retainAll(second);
        return intersectionSet;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }
}
