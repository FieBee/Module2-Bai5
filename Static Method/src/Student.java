public class Student{
        private int rollno;
        private String name;
        private static String college = "BBDIT";

//        Contructor thay khởi tạo biến
        Student(int r, String n){
            this.rollno = r;
            this.name = n;
        }

//        phương thức tĩnh thay đổi giá trị biến tĩnh
        static void change(){
            college = "CODEGYM";
        }
        void display(){
            System.out.println(rollno + " " + name + " " + college);
        }

}
