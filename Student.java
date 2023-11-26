public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Student s[]=new Student[2];
        s[0]= new Student("Ahmed",708);
        s[1]= new Student("Ali",486);
        for (int i = 0; i < s.length ; i++) {
            System.out.println(s[i]);
        }


    }
}
