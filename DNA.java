/**
 *  Tom Chiapete
 *  Course: CSCI 241 - Computer Science I
 *  Section: 001
 *  
 * This class implements a model of the DNA molecule.
 * This class was created in lab, other than the modification of 
 * the RNA method.
 *      
 *  Known bugs: None known.
 */

public class DNA
{
    private String sequence;  // holds our DNA sequence.

    /**
     * Constructor for objects of class DNA
     * Convert the sequence to uppercase, and make sure that
     * the DNA sequence is actually valid.
     */
    public DNA(String initSequence)
    {
        sequence = initSequence.toUpperCase();
        validate();
    }
    
    /** 
     * validate() method
     * Checks the pattern and makes sure that the only 
     * letters allowed in DNA are A, C, G, and T.
     */
    private void validate()
    {
        // write the body of this method for checkpoint #1
        
        if (sequence.matches("[ACGT]*") == false)
            System.out.println("This is not a valid sequence.");
    }
    
    /** 
     * This method returns the sequence
     */
    public String getSequence()
    {
        return sequence;
    }
    
    /**
     * This method translates the DNA object to a String.
     * Basically it just returns the sequence.
     */
    public String toString ()
    {
        return sequence;
    }

    /**
     * This method returns a String containing the RNA sequence 
     * corresponding to the DNA sequence
     * 
     * Simply change all T's to U's, then return it as a new RNA
     * object.
     */
    public RNA toRNA ()
    {
        String rna = sequence.replaceAll("T","U");
        
        return new RNA(rna);
    }

    /**
     * reverseComplement() method.
     * Returns a string.
     * Even though Y and Z are not allowed as valid letters, they are 
     * just used as temporary "placeholders" so we can make changes later.
     * 
     * The way we did it here without a loop is we created a StringBuilder
     * object, did our replacements,  reversed the StringBuilder, and 
     * turned it back into a string.
     */
    public String reverseComplement()
    {
           StringBuilder sb = new StringBuilder(
                sequence.replaceAll("A","Z").
                replaceAll("C","Y").replaceAll("T","A").
                replaceAll("G","C").replaceAll("Z","T").
                replaceAll("Y","G"));
           return sb.reverse().toString();
    }
}
