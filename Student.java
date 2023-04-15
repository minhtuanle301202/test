class Student{
    private String name  ;
    private char gender ;
    public Student() {
        name ="Unknown" ;
        gender = 'u' ;
    }
    public Student(String name) {
        this.name = name  ;
        gender = 'u' ;
    }
    public Student(char gender) {
        this.gender = gender ;
        name = "Unknown" ;
    }
    public  Student(String name, char gender) {
   this.name = name ;
   this.gender = gender ;
    }
    public void display() {
        if(name == "Unknown")
            System.out.println("Unknown") ;
        else System.out.println(name) ;
        if(gender=='f')
            System.out.println("Female") ;
        else if(gender=='m')
            System.out.println("Male") ;
        else  System.out.println("Unknown") ;
    } }
class Entry {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Quang");
        s2.display();
        Student s3 = new Student('m');
        s3.display();
        Student s4 = new Student("Thu", 'f');
        s4.display();
    }
}
