package ru.mirea.lab9;

import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
      /*  Student [] arr  = new Student[10];
        for (int i = 0; i < 10; i++)
        {
            arr[i] = new Student(i,"qwer");
            //System.out.println(arr[i].toString());
        }
        Student.sort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i].toString());
        }
*/
        SortingStudentsByGPA [] arr2  = new SortingStudentsByGPA[10];
        for (int i = 9; i >= 0; i--)
        {
            arr2[i] = new SortingStudentsByGPA(i,"qwer");
            //System.out.println(arr[i].toString());
        }
        SortingStudentsByGPA.quickSort(arr2,0,9);
        for (int i = 0; i < 10; i++) {
            System.out.println(arr2[i].toString());
        }
        /*Comparator C = new SortingStudentsByGPA();
        System.out.println(arr2[0].toString() + " " + arr2[1].toString());
        System.out.println(C.compare(arr2[0],arr2[1]));*/
    }

}