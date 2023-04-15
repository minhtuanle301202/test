class Student {
    private int id ;
    private String name  ;
    private int age ;
    private String address ;
    private int score ;
    public Student() {
    }
    public Student(int id,String name,int age,String address,int score) {
        this.id = id ;
        this.name = name ;
        this.age = age ;
        this.score = score ;
        this.address = address ;
    }
    public int getId() {
     return id  ;
     }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name ;
     }

    public String getName() {
        return name;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public int getAge(){
        return age ;
    }
    public String getAddress(){
        return address ;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setScore(int score) {
         if(score<0)
            score = 0 ;
         if(score>10)
             score = 10 ;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

}
class Entry {
    public static void main(String[] args) {
        Student s = new Student(1001, "Trung", 24, "Ha Noi", 5);
        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getAddress());
        System.out.println(s.getScore());
        s.setScore(-7);
        System.out.println(s.getScore());
        s.setScore(15);
        System.out.println(s.getScore());
    }
}