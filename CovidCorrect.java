package ios.JavaApis;

import java.util.Scanner;

public class CovidCorrect {
    public static void main(String[] args) {
        System.out.println("\t RHAYMON SELF ASSESSMENT TEST FOR COVID19.");
        System.out.println("CREATED BY : NANOSOFT SOFTWARE ENGINEERS. ");
        System.out.println("SPONSORED BY : WHO");
        Scanner sc = new Scanner(System.in);


        String [] symptoms = {"HEADACHE", "SORE THROAT", " DIARRHOEA","DRY COUGH"," WEAKNESS","FEVER"};
        String[] symptomsResponse =new String[symptoms.length];

        for (int i = 0; i < symptoms.length; i++){
            System.out.println("DO YOU HAVE " + symptoms[i] + "\n 1.YES \n 2.NO ");
            symptomsResponse[i] = sc.nextLine();
            while(!("1".equals(symptomsResponse[i]) || "2".equals(symptomsResponse[i])))
            {
                System.out.println("KINDLY PRESS 1 OR 2.");
               symptomsResponse[i] = sc.nextLine();
            }
        }

        System.out.println("******************** SUMMARY ********************");
        for (int i = 0; i < symptoms.length; i++){
            String Summary =symptomsResponse[i].equals("1")? "YES" : "NO";
            System.out.println("DO YOU HAVE " + symptoms[i] + ":" + Summary);
        }

        
        int YesCount = 0;
    int NoCount = 0;
       for  (int r =0; r < symptomsResponse.length; r++)
        {
        if(symptomsResponse[r].equals("1"))
        {
        YesCount++;
        System.out.println("Number of YesCount :" + YesCount);

        }
        else
        {
        NoCount++;
        System.out.println("Number of NoCount :" + NoCount );

        }
       }
        if (YesCount == symptoms.length)
        {
        System.out.println(" Visit your doctor or NCDC with an immediate effect.");
        }
        else {
        System.out.println(" You can go to the hospital if you wish.");
        }
    }
}
