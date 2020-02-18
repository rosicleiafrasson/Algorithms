package datastructures.binarytrees;

public class Contact implements Comparable<Contact>{

    private String name;

    public Contact(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Contact other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " ";
    }
}
