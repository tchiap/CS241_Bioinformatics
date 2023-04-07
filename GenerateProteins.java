
/**
 * Tom Chiapete
 * Course: CSCI 241 - Computer Science I
 * Section:  001
 * 
 * GenerateProteins class
 * This is the tester or demo class.
 * 
 * We'll take in a text file containing a DNA sequence,
 * and then use that data to show it's RNA and reverse complement.
 * 
 * Known bugs:  None known.
 */

import java.util.*;
import java.io.*;

public class GenerateProteins
{
    /** 
     * main() static method
     * Inputs a file using the Scanner class, then we can find 
     * the RNA, reverse complement, and search frames for 
     * proteins.
     */
    public static void main(String [] args) throws Exception
    {
        // Input the filename
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the filename of the "+
            "DNA sequence:  ");
        String filepath = input.next();
        
        // Open that file based on the filename.
        // Throws an error if it's not found.
        Scanner file = new Scanner(new File(filepath));
        
        // Read in that data and put it into a string variable 'data'.
        String data = file.nextLine();
        
        // Create DNA and RNA objects based on the DNA data found in 
        // the file read in.
        DNA dna = new DNA(data);
        RNA rna = dna.toRNA();
        String rnaString = rna.toString();  // RNA string
        
        // Output RNA
        System.out.println("RNA:");
        System.out.println(rnaString);
        System.out.println();
        System.out.println();
        
        // Finds the Reverse Complement of DNA.
        System.out.println("Reverse Complement of DNA:");
        String revCompDNA = dna.reverseComplement();
        System.out.println(revCompDNA);
        
        // Translate that reverse complement to RNA.
        DNA dna2 = new DNA(revCompDNA);
        RNA rna2 = dna2.toRNA();
        System.out.println("Translation of Reverse Complement to RNA:");
        System.out.println(rna2.toString());
        System.out.println();
        System.out.println();
        System.out.println();

        // Search for proteins in three consecutive frames.
        Scanner input2 = new Scanner(System.in);
        System.out.println("-Protein Search-");
        System.out.println("Enter starting position:  ");
        int pos = input2.nextInt();
        System.out.println("At first position:  "+rna.toProtein(pos));
        pos++;
        System.out.println("At next position:  "+rna.toProtein(pos));
        pos++;
        System.out.println("At third position:  "+rna.toProtein(pos));
    }
}
