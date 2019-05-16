package br.com.sergiogoncalves.sandbox.sand.challenges;

public class GradingStudents {


    public static int[] gradingStudents(int[] grades) {


        int[] results = new int[grades.length];

        int count = 0;

        for (int i : grades) {

            if((i % 5) > 0) {

            if((i + (5 - (i % 5)) >= 40)){

                if ((5 - (i % 5)) < 3 ) {

                    results[count] = ((5 - (i % 5)) + i);

                }else {
                    results[count] = i;
                }

            }else {
                results[count] = i;
            }

            } else {
                    results[count] = i;
            }
            count++;
        }

        return results;


    }

}
