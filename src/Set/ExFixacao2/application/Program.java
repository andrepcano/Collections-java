package Set.ExFixacao2.application;

import Set.ExFixacao2.entities.Cursos;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Cursos> set = new TreeSet<>();

        System.out.println("How many students for course A?");
        int nA = sc.nextInt();

        for (int i = 1; i <= nA; i++) {
            System.out.println("Student #" + i);
            int id = sc.nextInt();
            set.add(new Cursos(id));
        }


        System.out.println("How many students for course B?");
        int nB = sc.nextInt();

        for (int i = 1; i <= nB; i++) {
            System.out.println("Student #" + i);
            int id = sc.nextInt();
            set.add(new Cursos(id));
        }


        System.out.println("How many students for course C?");
        int nC = sc.nextInt();

        for (int i = 1; i <= nC; i++) {
            System.out.println("Student #" + i);
            int id = sc.nextInt();
            set.add(new Cursos(id));
        }

        System.out.println("Total Students: " + set.size());
    }
}
