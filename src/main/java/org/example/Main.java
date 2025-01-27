package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("workintech", "bot", "ann", Status.ASSIGNED , Priority.MED);
        Task taskAnn2 = new Task("workintech", "boddt", "ann", Status.ASSIGNED , Priority.MED);
        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);


        Set<Task> bobsTasks = new HashSet<>();
        Task taskbob = new Task("workintech", "asdada", "bob",Status.ASSIGNED, Priority.MED);
        Task taskbob2 = new Task("workintech", "adazsdada", "bob", Status.ASSIGNED , Priority.MED);

        bobsTasks.add(taskbob);
        bobsTasks.add(taskbob2);


        Set<Task> carolsTasks = new HashSet<>();

        Task taskcarol = new Task("workintech", "asssscsdd", "carol", Status.ASSIGNED , Priority.MED);
        Task taskcarol2 = new Task("workintech", "adsd", "carol", Status.ASSIGNED , Priority.MED);

        carolsTasks.add(taskcarol);
        carolsTasks.add(taskcarol2);


        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("workintech", "asssscsdd", "unassigned",Status.ASSIGNED  , Priority.MED);
        unassignedTasks.add(unassignedTask);

        TaskData taskData = new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks);
        System.out.println("bobtask: " + taskData.getTasks("bob"));
        System.out.println("caroltask: " + taskData.getTasks("carol"));
        System.out.println("anntask: " + taskData.getTasks("ann"));
        System.out.println("alltasks: " + taskData.getTasks("all"));

        StringSet.findUniqueWords();
    }
}