

package com.mycompany.studentlinkedlist;
import java.util.Scanner;
class StudentNode{
    String rollno;
    String name;
    String email;
    int percentage;
    StudentNode next;
}
    public StudentNode(String rollNo,String name,String email,int percentage){
    this.rollNo=rollno;
    this.name=name;
    this.email=email;
    this.percentage=percentage;
    this.next=null;
}
)
class StudentLinkedList{
    private StudentNode head;
    public void insert(String rollno,String name,String email,int percentage);
    if(head==null){
    head=newNode;
}else{
    StudentNode current=head;
    while(current!= null){
        current=current.next;
        
    }
    current.next=newNode;
}
}

public class StudentLinkedList {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
