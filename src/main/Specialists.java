package main;

import java.util.ArrayList;
import java.util.List;

public class Specialists extends HealthProfessional{
    public String domain;
    public List<Specialists> ArrayList = new ArrayList<>();

    @Override
    public String toString() {
        return "ID:" + ID +", name:"+name +", age:"+ sex +", workingPlace:"+ domain;
    }

    public Specialists(){}

    public Specialists(int ID, String name, String sex, String domain){
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.domain = domain;
    }

    public void createSurgeonsList() {
        Specialists Specialists1= new Specialists(4,"Mr Han","female", "Brain expert");
        this.ArrayList.add(Specialists1);
        Specialists Specialists2= new Specialists(5,"Mr Liu","female", "Orthopaedic expert");
        this.ArrayList.add(Specialists2);
    }

    public void PrintlnSurgeons(){
        System.out.println("The Surgeons details are: " + "ID:" + ID +" ,name:"+ name +" ,sex:"+ sex +" ,domain:"+ domain);
    }
}
