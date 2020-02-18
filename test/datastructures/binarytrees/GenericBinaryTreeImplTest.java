package datastructures.binarytrees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenericBinaryTreeImplTest {

    @Test
    void insertSomeItems() {
        GenericBinaryTree<Contact> contacts = new GenericBinaryTreeImpl<Contact>();
        contacts.insert(new Contact("Maria"));
        contacts.insert(new Contact("Ana"));
        contacts.insert(new Contact("Beatriz"));
        contacts.insert(new Contact("Manuela"));
        contacts.insert(new Contact("Rosimery"));
        contacts.insert(new Contact("Thalia"));
        contacts.insert(new Contact("Amanda"));
        assertEquals("Amanda Ana Beatriz Manuela Maria Rosimery Thalia ", contacts.inOrder());
    }

    @Test
    void containItem() {
        GenericBinaryTree<Contact> contacts = new GenericBinaryTreeImpl<Contact>();
        contacts.insert(new Contact("Maria"));
        contacts.insert(new Contact("Ana"));
        contacts.insert(new Contact("Beatriz"));
        contacts.insert(new Contact("Manuela"));
        contacts.insert(new Contact("Rosimery"));
        contacts.insert(new Contact("Thalia"));
        contacts.insert(new Contact("Amanda"));
        assertEquals(true, contacts.contains(new Contact("Thalia")));
    }

    @Test
    void dontContainItem() {
        GenericBinaryTree<Contact> contacts = new GenericBinaryTreeImpl<Contact>();
        contacts.insert(new Contact("Maria"));
        contacts.insert(new Contact("Ana"));
        contacts.insert(new Contact("Beatriz"));
        contacts.insert(new Contact("Manuela"));
        contacts.insert(new Contact("Rosimery"));
        contacts.insert(new Contact("Thalia"));
        contacts.insert(new Contact("Amanda"));
        assertEquals(false, contacts.contains(new Contact("Augusto")));
    }

    @Test
    void preOrder(){
        GenericBinaryTree<Contact> contacts = new GenericBinaryTreeImpl<Contact>();
        contacts.insert(new Contact("Maria"));
        contacts.insert(new Contact("Ana"));
        contacts.insert(new Contact("Beatriz"));
        contacts.insert(new Contact("Manuela"));
        contacts.insert(new Contact("Rosimery"));
        contacts.insert(new Contact("Thalia"));
        contacts.insert(new Contact("Amanda"));
        assertEquals("Maria Ana Amanda Beatriz Manuela Rosimery Thalia ", contacts.preOrder());
    }

    @Test
    void posOrder(){
        GenericBinaryTree<Contact> contacts = new GenericBinaryTreeImpl<Contact>();
        contacts.insert(new Contact("Maria"));
        contacts.insert(new Contact("Ana"));
        contacts.insert(new Contact("Beatriz"));
        contacts.insert(new Contact("Manuela"));
        contacts.insert(new Contact("Rosimery"));
        contacts.insert(new Contact("Thalia"));
        contacts.insert(new Contact("Amanda"));
        assertEquals("Amanda Manuela Beatriz Ana Thalia Rosimery Maria ", contacts.posOrder());
    }

    @Test
    void deleteEmptyTree() {
        GenericBinaryTree<Contact> contacts = new GenericBinaryTreeImpl<Contact>();
        Contact contact = new Contact("Maria");
        boolean response = contacts.delete(contact);
        assertEquals(false, response);
    }

    @Test
    void constainsEmptyTree() {
        GenericBinaryTree<Contact> contacts = new GenericBinaryTreeImpl<Contact>();
        Contact contact = new Contact("Maria");
        boolean response = contacts.contains(contact);
        assertEquals(false, response);
    }



}