package schedule;

public class Schedule {
    public static void main(String[] args) {
        String firstName = "Justin";
        String lastName = "Parrondo";
        int gradYear = 2020;
        
        System.out.println("My name is " + firstName + " " + lastName + " and I'll graduate in " + gradYear);
        
        String classNames[] = {"Hon. Global Studies", "AP Computer Science A", "AP English Language and Composition", "AP Research",
                               "AP Physics", "Honors Pre-Calculus", "Honors US History"};
        String classTeachers[] = {"Deacon Dugard", "Mr. Larrubia", "Mr. Crossman", "Mr. Kumer", "Mr. Sanchez", "Mr. Ortega",
                               "Mr. Cunningham"};
        
        for (int i = 0; i < classNames.length; i++) {
            System.out.printf("%d\t%s\t%s\n", (i+1), classNames[i], classTeachers[i]);
        }
    }
}
