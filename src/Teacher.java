/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakshi jain
 */
class Teacher {
    
    private int Batch_Code;
    private String Name, Batch_Days, Subject;
    
    Teacher(int Batch_Code , String Name , String Batch_Days , String Subject)
    {
        this.Batch_Code= Batch_Code;
        this.Name= Name;
        this.Batch_Days= Batch_Days;
        this.Subject= Subject;
    }
    
    
    public int getBatch_Code()
    {
        return Batch_Code;
    }
    
     public String getName()
    {
        return Name;
    
    }
    public String getBatch_Days()
    {
        return (String) Batch_Days;
    }
    
     public String getSubject()
    {
        return (String) Subject;
    }
     
}
