/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuche
 */
public class MisinformationCase extends EthicsCase {

    // The type of media where misinformation appears
    private String mediaType;

    /**
     * Constructor for creating a MisinformationCase object.
     * 
     * @param caseTitle   the title of the ethics case
     * @param description the description of the case
     * @param mediaType   the type of media involved (e.g., video, news, social media)
     */
    public MisinformationCase(String caseTitle, String description, String mediaType) {

        // Call parent constructor with fixed category "Misinformation"
        super(caseTitle, description, "Misinformation");

        // Initialize media type
        this.mediaType = mediaType;

        // Initialize a new Verdict object for this case
        this.verdict = new Verdict();
    }

    /**
     * Returns the media type associated with the misinformation case.
     * 
     * @return the media type
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Returns a string representation of the MisinformationCase object.
     * 
     * @return formatted string including media type
     */
    @Override
    public String toString() {
        return super.toString() + ", mediaType: " + mediaType;
    }
}