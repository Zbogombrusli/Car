package person;

public class Teacher extends Person {

    private  String mainSubject;
    private  String yearsOfExperience;
    private  String gender;

    public Teacher() {
    this.mainSubject="Nastavnik";
    this.yearsOfExperience="Godine iskustva";
    this.gender="Pol";
    }
    
    public Teacher(String mainSubject,String yearsOfExperience,String gender ){
        this.mainSubject=mainSubject;
        this.yearsOfExperience=yearsOfExperience;
        this.gender=gender;
        
    }
    
    public String getMainSubject(){
        return this.mainSubject;
    }
    
    public void setMainSubject(String newMainSubject){
        this.mainSubject=newMainSubject;
    }
    
    public String getYearsOfExperience(){
        return this.yearsOfExperience;
    }
    
    public void setYearsOfExperience(String newYearsOfExperience){
       
        this.yearsOfExperience=newYearsOfExperience;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public void setGender(String newGender){
        this.gender=newGender;
    }
    
    @Override
    public void showData() {
        super.showData();
        System.out.println("Teacher:" + mainSubject);
        System.out.println("Years of experience:" + yearsOfExperience);
        System.out.println("Gender:" + gender);
        System.out.println();
        
    }
  
}
