package ru.mirea.lab9;

public class Student
{
    public static void sort(Student Students [])
    {
        Student swap;
        int max;
        int maxPose;
        for (int j=0;j<Students.length;j++)
        {
            max = Students[j].getIdNumber();
            maxPose=j;
            for(int i =j;i<Students.length;i++)
            {
                if(Students[i].getIdNumber()>max)
                {
                    max=Students[i].getIdNumber();
                    maxPose=i;
                }
            }
            swap=Students[j];
            Students[j]=Students[maxPose];
            Students[maxPose]=swap;


        }
    }

    private int mark;
    private String name;

    public Student(int mark, String name)
    {
        this.mark = mark;
        this.name = name;
    }
    public Student()
    {
        this.mark = 0;
        this.name = "";
    }

    public int getIdNumber() {
        return mark;
    }

    public void setIdNumber(int idNumber) {
        mark = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IdNumber=" + mark +
                ", name='" + name + '\'' +
                '}';
    }
}
