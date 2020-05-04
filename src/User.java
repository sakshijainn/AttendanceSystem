
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakshi jain
 */
class User {
    
    private String Name;
    private int Enrollment_Number , Batch_Code;
    
    public User(String Name , int Enrollment_Number , int Batch_Code)
    {
        this.Name = Name;
        this.Enrollment_Number = Enrollment_Number;
        this.Batch_Code = Batch_Code;
    }
    
    public String getName()
    {
        
       return Name;
    }
    
    public int getEnrollment_Number()
    {
        return Enrollment_Number;
    }
    
    public int getBatch_Code()
    {
        return Batch_Code;
    }
}
