/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuche
 */
class PrivacyCase extends EthicsCase {

    // The type of data involved in the privacy case
    private String dataType;

    /**
     * Constructor for creating a PrivacyCase object.
     * 
     * @param caseTitle   the title of the ethics case
     * @param description the description of the case
     * @param dataType    the type of data involved
     */
    public PrivacyCase(String caseTitle, String description, String dataType) {

        // Call parent constructor and set category as "Privacy"
        super(caseTitle, description, "PrivacyCase");

        // Initialize data type
        this.dataType = dataType;

        // Create a new Verdict object for this case
        this.verdict = new Verdict();
    }

    /**
     * Returns the type of data involved in the privacy case.
     * 
     * @return the data type
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Returns a string representation of the PrivacyCase object.
     * 
     * @return formatted case information including data type
     */
    @Override
    public String toString() {
        return super.toString() + ", data type: " + dataType;
    }
}
