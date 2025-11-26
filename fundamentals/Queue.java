package bites.examples;

import java.util.ArrayList;

public class Queue {
    ArrayList<String> people = new ArrayList<>();

    public void Add(String person) {
        people.add(person);
    }

    public String Next() {
        if (people.isEmpty()) {
            return null;
        }
        return people.removeFirst();
    }

    public void State() {
        System.out.println(people.toString());
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.Add("Milo");
        q.Add("Tashi");
        q.Add("Jake");
        q.State();
        q.Next();
        q.State();
    }
}
