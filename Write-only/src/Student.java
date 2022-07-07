public class Student {
    private String name ;
    private String classes ;

    Student(){
        this.name = "John";
        this.classes = "C02";
    }

    protected void setName(String name){
        this.name = name;
    }
    protected void setClasses(String classes){
        this.classes = classes;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
