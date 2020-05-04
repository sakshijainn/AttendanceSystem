/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakshi jain
 */
class ShowTable {
    private String Student_Name, Select_Attendance , Date_Attendance;
    private int Enrollment_Number , Batch_Code;
    
    public ShowTable(int Batch_Code,String Student_Name , int Enrollment_Number , String Select_Attendance, String Date_Attendance )
    {
        this.Student_Name = Student_Name;
        this.Enrollment_Number = Enrollment_Number;
        this.Batch_Code = Batch_Code;
        this.Select_Attendance= Select_Attendance;
        this.Date_Attendance=Date_Attendance;
    }
    
    public String getStudent_Name()
    {
        
       return Student_Name;
    }
    
    public int getEnrollment_Number()
    {
        return Enrollment_Number;
    }
    
    public int getBatch_Code()
    {
        return Batch_Code;
    }
    
    public String getSelect_Attendance()
    {
        return Select_Attendance;
        
    }
    
    public String getDate_Attendance()
    {
        return Date_Attendance;
    }
}
