package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DogFood dogFood = new DogFood("purina");
        Animal dog = new Animal();
        Rescuer rescuer = new Rescuer();
        System.out.println(rescuer.name + " gave some "+ dogFood.name + " to " + dog.name );
    }


}
