package week1;
public class Student {
    private String name ,id ,group ,email;
    public void setName(String name1){
        this.name = name1;}
    public String getName(){
        return name;}
    public void setId(String id1){
        this.id = id1;}
    public String getId(){
        return id;}
    public void  setGroup(String group1){
        this.group = group1;}
    public String getGroup(){
        return group;}
    public void setEmail(String email1){
        this.email=email1;}
    public String getEmail(){
        return email;}
    /**
     * Constructor 1
     */
    public Student() {
        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String sid, String em) {
        // TODO:
        name=n;
        id=sid;
        email=em;
        group="INT2204";
    }

    /**
     * Constructor 3
     * @param s
     */
    public Student(Student s) {
        name=s.getName();
        id=s.getId();
        email=s.getEmail();
        group=s.getGroup();
    }

    public void getInfo() {
        // TODO:
        System.out.println("Ten: "+name + "\n");

        System.out.println("Id: "+id + "\n");

        System.out.println("Lop: "+group + "\n");

        System.out.println("Email:" +email + "\n");

    }

}

