public class Student {

    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setStudentname(String name){
        this.name = name;
    }
    public String getName(){return this.name;}

    public String toString(){
        return "Student id "+id+", name "+name+"; \n";
    }
}
