
/**
 * Tom Chiapete
 * Course: CSCI 241 - Computer Science I
 * Section:  001
 * 
 * RNA class
 * This RNA class holds the data for all the proteins, and will 
 * find protein sequences based on the position.
 * 
 * Known bugs:  I think something may be wrong with it, because I 
 * can only find a handful of proteins in those DNA text files.
 */
public class RNA
{
    private String sequence;  // holds the RNA sequence.
    
    // Constants.  I made them public because they could be 
    // useful to somebody else, possibly...
    public static final String ALANINE = "GCAGCCGCGGCU"; // Alanine sequence
    public static final String CYSTEINE = "UGCUGU"; // Cysteine sequence
    public static final String ASPARTIC_ACID = "GACGAU"; // Aspartic acid seq.
    public static final String GLUTAMIC_ACID = "GAAGAG"; // Gludamic acid seq.
    public static final String PHENYLALANINE = "UUCUUU"; // Phenylalanine seq.
    public static final String GLYCINE = "GGAGGCGGGGGU"; // Glycine sequence
    public static final String HISTIDINE = "CACCAU"; // Histidine sequence
    public static final String ISOLEUCINE = "AUAAUCAUU"; // Isoleusine sequence.
    public static final String LYSINE = "AAAAAG"; // Lysine sequence.
    public static final String LEUCINE = "UUAUUGCUACUCCUGCUU"; //Leucine sequence
    public static final String METHIONINE = "AUG"; // Methionine sequence.
    public static final String ASPARAGINE = "AACAAU"; // Asparagine sequence.
    public static final String PROLINE = "CCACCCCCGCCU"; // Proline sequence.
    public static final String GLUTAMINE = "CAACAG"; // Glutamine sequence.
    public static final String ARGININE = "AGAAGGCGACGCCGGCGU"; // Arginine seq.
    public static final String SERINE = "AGCAGUUCAUCCUCGUCU"; // Serine sequence
    public static final String THREONINE = "ACAACCACGACU"; // Threonine seq.
    public static final String VALINE = "GUAGUCGUGGUU"; // Valine sequence
    public static final String TRYPTOPHAN = "AGG"; // Tryptophan sequence
    public static final String TYROSINE = "UACUAU"; // Tyrosine sequence
    
    /**
     * RNA() constructor
     * Takes in one parameter, a sequence, changes its case to 
     * uppercase, then places it into the sequence instance variable.
     */
    public RNA(String sequence)
    {
        this.sequence = sequence.toUpperCase();
    }
    
    /** 
     * getSequence() method
     * Returns the sequence as a string.
     */
    public String getSequence()
    {
        return sequence;   
    }
    
    /** 
     * toString() method
     * Same as before, returns the sequence.
     */
    public String toString()
    {
        return sequence;
    }
    
    /**
     * toProtein() method
     * Finds a protein based on the frame you give it.
     * If nothing is found, let them know that.
     * 
     * If the sequence is found using the indexOf() method,
     * return that protein.
     */
    public String toProtein(int frame)
    {
        String workingRNA = sequence;
        if(workingRNA.indexOf(ALANINE) == frame)
            return "Alanine";
        else if(workingRNA.indexOf(CYSTEINE) == frame)
            return "Cysteine";
        else if(workingRNA.indexOf(ASPARTIC_ACID) == frame)
            return "Aspartic Acid";
        else if(workingRNA.indexOf(GLUTAMIC_ACID) == frame)
            return "Glutamic Acid";
        else if(workingRNA.indexOf(PHENYLALANINE) == frame)
            return "Phenylalanine";
        else if(workingRNA.indexOf(GLYCINE) == frame)
            return "Glycine";
        else if(workingRNA.indexOf(HISTIDINE) == frame)
            return "Histidine";
        else if(workingRNA.indexOf(ISOLEUCINE) == frame)
            return "Isoleucine";
        else if(workingRNA.indexOf(LYSINE) == frame)
            return "Lysine";
        else if(workingRNA.indexOf(LEUCINE) == frame)
            return "Leucine";
        else if(workingRNA.indexOf(METHIONINE) == frame)
            return "Methionine";
        else if(workingRNA.indexOf(ASPARAGINE) == frame)
            return "Asparagine";
        else if(workingRNA.indexOf(PROLINE) == frame)
            return "Proline";
        else if(workingRNA.indexOf(GLUTAMINE) == frame)
            return "Glutamine";
        else if(workingRNA.indexOf(ARGININE) == frame)
            return "Arginine";
        else if(workingRNA.indexOf(SERINE) == frame)
            return "Serine";
        else if(workingRNA.indexOf(THREONINE) == frame)
            return "Threonine";
        else if(workingRNA.indexOf(VALINE) == frame)
            return "Valine";
        else if(workingRNA.indexOf(TRYPTOPHAN) == frame)
            return "Tryptophan";
        else if(workingRNA.indexOf(TYROSINE) == frame)
            return "Tyrosine";
        return "No Matching Protein At This Frame";
    }
}
