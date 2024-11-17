package main;

public class HealthProfessional {
    public int ID;
    public String name;
    public String sex;

    HealthProfessional(){}

    HealthProfessional(int ID,String name,String sex){
        this.ID = ID;
        this.name = name;
        this.sex = sex;
    }

    public void PrintlnHealthProfessional(){
        System.out.println(" ID: " + ID);
        System.out.println(" name: " + name);
        System.out.println(" sex;: " + sex);
    }


}
