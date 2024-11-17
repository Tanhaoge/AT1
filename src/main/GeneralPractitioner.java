package main;

import java.util.ArrayList;
import java.util.List;

public class GeneralPractitioner extends HealthProfessional{
    public String domain;
    public List<GeneralPractitioner> ArrayList = new ArrayList<>();
    @Override
    public String toString() {
        return "ID:" + ID +", name:"+name +", sex:"+ sex +", domain:"+ domain;
    }

    public GeneralPractitioner(){}
    public GeneralPractitioner(int ID,String name,String sex, String domain){
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.domain = domain;
    }

    public void createGeneralPractitioner() {
        GeneralPractitioner GeneralPractitioner1= new GeneralPractitioner(1,"Tan 1","male", "dentistry");
        this.ArrayList.add(GeneralPractitioner1);
        GeneralPractitioner GeneralPractitioner2= new GeneralPractitioner(2,"Tan 2","male", "orthopaedics");
        this.ArrayList.add(GeneralPractitioner2);
        GeneralPractitioner GeneralPractitioner3= new GeneralPractitioner(3,"Tan 3","male", "internal medicine");
        this.ArrayList.add(GeneralPractitioner3);
    }

    public void PrintlnFun(int num){
        System.out.println("The General Practitioner details are: " + "ID:" + ID +", name:"+ name +", sex:"+ sex +", domain:"+ domain);
    }

}
