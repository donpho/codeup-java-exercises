package grades;

import java.util.ArrayList;


public class Student {
    private ArrayList<Integer> grade = new ArrayList<>();
    private String name;

    public Student(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.addGrade(grade1);
        this.addGrade(grade2);
        this.addGrade(grade3);
    }

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        this.grade.add(grade);
    }

    public double getGradeAverage(){
        double average = 0;
        for (int i = 0; i<grade.size(); i++){
            average += grade.get(i);
        }
        return average/grade.size();
    }

    public void getGrade(){
        System.out.println(this.grade);
    }

    public static void main(String[] args) {
        Student someone = new Student("Don");

        someone.addGrade(100);
        someone.addGrade(50);

        System.out.println(someone.getGradeAverage());
        someone.getGrade();
    }


}
