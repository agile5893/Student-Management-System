/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Aracely Delgadillo
 * Final Project
 * 
 * This class encapsulates all student data. 
 * 
 */
public class Student {
   
    private String name;
    private int age;
    private static int ID = 0;
    private String firstParent;
    private String secondParent;
    //private boolean bus = false;
    private String streetAddress;
    private String city;
    private int zipcode;
    private int tuition;
    
    //default constructor
    public Student(){
        age = 0;
        name = "XXX";
        firstParent = "XXX";
        secondParent = "XXX";
        streetAddress = "XXX";
        city = "XXX";
        zipcode = 0;
        tuition = 0;
        
        
    }
     //constructor
    public Student(String name, String firstParent, String secondParent, String streetAddress, String city, int zipcode, int age){
        this.name = name;
        this.firstParent = firstParent;
        this.secondParent = secondParent;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipcode = zipcode;
        this.age = age;
        setID();//increment to next ID
        System.out.println(name);
        System.out.println("Student ID: " + getID());
        System.out.println("$" + calcTuition(age) + "/week");
        
        
    }
    
    public int calcTuition(int age){
        if(age == 3){
            tuition = 270;//per week
        }
        if(age == 4){
            tuition = 260;//per week
        }
        return tuition;
              
    }
    
    //setters
    public void setID(){
        ID++;
    }
    
    //getters
    public int getID(){
        return ID;
    }

   
    public String getName(){
        return name;
    }
    
   
   
  
    
    
}
