package main;
public class Appointment {

    public String patientName;
    public String patientPhone;
    public String patientType;
    public String preferredTime;
    public String Doctor;

    public Appointment() {}

    public Appointment(String patientName,String patientPhone,String preferredTime,String Doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTime = preferredTime;
        this.Doctor = Doctor;
    }

    @Override
    public String toString() {
        return "patientName:" + patientName +", patientPhone:"+patientPhone + ", preferredTime:"+ preferredTime +", Doctor:"+ Doctor;
    }

    public void PrintlnGeneralPractitioner(){
        System.out.println("The General Practitioner details are: " + "patientName:" + patientName +" ,patientPhone:"+ patientPhone + " ,preferredTime:"+ preferredTime +" ,Doctor:"+ Doctor);
    }

}
