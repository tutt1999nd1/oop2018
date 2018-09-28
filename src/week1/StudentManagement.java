package week1;
public class StudentManagement {
    private Student[] students= new Student[100];

    int count=0;


    public void addsv(Student sv){
        students[count++]=sv;
    }

    public void indssv(){
        for(int i=0;i<count;i++) {
            System.out.println(students[i].getName()+ " ");
        }

    }
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.getGroup()).equals(s2.getGroup());
    }

    public void studentsByGroup() {
        String[] group = new String[100];
        int i,j,length=0;
        for (i=0;i<count;i++) {
            for (j=0;j<length;j++) {
                if (students[i].getGroup().equals(group[j])) break;
            }
            if (j==length){
                group[length++] = students[i].getGroup();}
        }
        for (i=0;i<length;i++) {
            System.out.println("nhung nguoi thuoc lop "+group[i] + ": ");
            for (j=0;j<count;j++) {
                if (students[j].getGroup().equals(group[i])) {
                    System.out.println("	"+students[j].getName());
                }
            }
        }
    }
    void removeStudent(String id){
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < count-1 ; j++) {
                    students[j] = students[j + 1];
                }
                count--;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement dssv = new StudentManagement();

        //in thong tin cua ban
        Student sv1= new Student();
        sv1.setName("Truong Thanh Tu");
        sv1.setId("17021099");
        sv1.setGroup("Int2204");
        sv1.setEmail("thanhtu199969@gmail.com");
        sv1.getInfo();

        //kiem tra 3 phuong thuc trong Student
        Student sv2= new Student();
        sv2.getInfo();
        Student sv3= new Student("Hiep Xong Che","696969","HiepXongChe199969@gmail.com");
        sv3.getInfo();
        Student sv4= new Student(sv3);
        sv4.getInfo();
        Student sv5= new Student();
        sv1.setName("Vuong Thi Ngoc Linh");
        sv1.setId("121999");
        sv1.setGroup("Int220469");
        sv1.setEmail("linh@gmail.com");

        //kiem tra ham sameGroup
        System.out.println(sameGroup(sv3,sv4));
        System.out.println(sameGroup(sv1,sv2));

        dssv.addsv(sv1);
        dssv.addsv(sv2);
        dssv.addsv(sv3);
        dssv.addsv(sv5);
        dssv.indssv();
        dssv.studentsByGroup();

        dssv.removeStudent("121999");
        dssv.indssv();



    }
}