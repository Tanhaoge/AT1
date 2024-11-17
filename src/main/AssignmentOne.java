package main;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public List<Appointment> ArrayList = new ArrayList<>();
    public void createAppointment(Appointment param) {
        if(param.patientName.isEmpty() || param.patientPhone.isEmpty() || param.preferredTime.isEmpty() || param.Doctor.isEmpty()){
            System.out.println("Incomplete information");
        } else {
            this.ArrayList.add(param);
        }
    }
    public void printExistingAppointments() {
        if(this.ArrayList.isEmpty()){
            System.out.println("no existing appointments !!");
        } else {
            for(int i=0;i<this.ArrayList.size();i++)
            {
                System.out.println("Appointments " + (i+1) + ": " + this.ArrayList.get(i));
            }
        }
    }
    public void cancelBooking(String phone) {
        if(this.useList(this.ArrayList, phone) != null){
            this.ArrayList.remove(this.useList(this.ArrayList, phone));
            System.out.println("cancelBooking success !!");
        } else {
            System.out.println("phone is not found !!");
        }
    }

    public static Object useList(List<Appointment> arr, String targetValue) {
        for(Appointment obj: arr){
            if(obj.patientPhone.equals(targetValue)){
                return obj;
            }
        }
        return null;
    }


    public static void main(String[] args){
        // Part 3 – Using classes and objects
        GeneralPractitioner myGeneralPractitioner= new GeneralPractitioner();
        myGeneralPractitioner.createGeneralPractitioner();
        Specialists mySpecialists = new Specialists();
        mySpecialists.createSurgeonsList();
        for(int i=0;i<myGeneralPractitioner.ArrayList.size();i++)
        {
            System.out.println("The General Practitioner " + (i+1) + " details are: " + myGeneralPractitioner.ArrayList.get(i));
        }
        for(int i = 0; i< mySpecialists.ArrayList.size(); i++)
        {
            System.out.println("The Specialists " + (i+1) + " details are: " + mySpecialists.ArrayList.get(i));
        }
        //Part 5 – Collection of appointments
        AssignmentOne myAssignmentOne= new AssignmentOne();
        Appointment Appointment1 = new Appointment("Tan1","13811111111", "08:00", "Mr Tan");
        myAssignmentOne.createAppointment(Appointment1);
        Appointment Appointment2 = new Appointment("Tan2","13822222222", "10:00", "Mr Tan");
        myAssignmentOne.createAppointment(Appointment2);
        Appointment Appointment3 = new Appointment("Tan3","13833333333", "10:00", "Mr Zhang");
        myAssignmentOne.createAppointment(Appointment3);
        Appointment Appointment4 = new Appointment("Tan4","13844444444", "10:00", "Mr Zhang");
        myAssignmentOne.createAppointment(Appointment4);
        myAssignmentOne.printExistingAppointments();
        myAssignmentOne.cancelBooking("13844444444");
        myAssignmentOne.printExistingAppointments();
    }
}
