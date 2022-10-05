package com.tamanna.mylib;

public class ODS {

    private static String name1 ="Vijaya";

    //Class
    /**A class is a template that helps create single or multiple objects.
     * It is not possible to create objects without a class.
     * For example, to create Student objects, there should be a Student class.
     * A class contains attributes and methods.
     * The attributes explain the states that an object should have,
     while the methods describe the behavior or functionalities that the object should have.
     *A class also has a special method called a constructor to give initial values to the attributes.
     *The attributes and methods of a class are members of a class.
     * You can have visibilities like public, private, and protected.
     * Overall, a class is a logical unit for creating objects, while an object is a physical unit.*/

    //Methods

    /**
     * A class consists of methods.
     * A method is a function that is used to describe the behavior of a function.
     * In addition, it helps with code optimization and code reusability.
     * The programmer can make the method public, private, or protected,
     depending on the application.
     * Public methods can be accessed outside the class, while protected
     methods can be accessed inside the class and by subclasses.
     * In addition, private methods are accessible within the class.
     */
    public static void PermanentEmp(){

        //localVariable
        String name = "Tamanna" ;
        System.out.println("Name: "+name);
    }

    public void ContractualEmp(){

        System.out.println("Name: "+name1);
    }


/*A class is a template for creating or instantiating objects within a program,
 while a method is a function that reveals the behavior of an object.*/

    public static void main (String[] args){

        ODS.PermanentEmp();//static keyword - When we use static we can be call the method without creating an obj


        ODS c1 = new ODS();
        c1.ContractualEmp();


    }
}