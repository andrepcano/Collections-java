package Map.ExFixacao.application;

import Map.ExFixacao.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Candidate> record = new HashMap<>();

        System.out.println("Enter the file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1].trim());

                if (record.containsKey(name)) {
                    record.get(name).addVotes(votes);
                } else {
                    record.put(name, new Candidate(name, votes));
                }

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Candidate candidate : record.values()) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes());
        }



        sc.close();
    }
}
