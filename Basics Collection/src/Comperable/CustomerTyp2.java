/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comperable;

/**
 *
 * @author root
 */
public class CustomerTyp2 implements Comparable<CustomerTyp2>{
 
      private String name;
    private int age;

    public CustomerTyp2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return name + " : " + age;
    }

    @Override
    public int compareTo(CustomerTyp2 arg) {
        
        return this.getAge() - arg.getAge();
    }
}
