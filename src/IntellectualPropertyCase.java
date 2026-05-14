/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuche
 */
public class IntellectualPropertyCase extends EthicsCase {
    // Private attribute as shown in UML (- ipType: String)
    private String ipType;

    /**
     * Constructor using parameters from the UML diagram
     * @param caseTitle Passed to parent constructor
     * @param description Passed to parent constructor
     * @param ipType Local field initialization
     */
    public IntellectualPropertyCase(String caseTitle, String description, String ipType) {
        // Calls EthicsCase constructor with "Intellectual Property" as the category
        super(caseTitle, description, "Intellectual Property");
        this.ipType = ipType;
    }

    /**
     * Public getter method (+ getIpType(): String)
     */
    public String getIpType() {
        return ipType;
    }

    /**
     * Overridden toString method (+ toString(): String)
     */
    @Override
    public String toString() {
        return super.toString() + ", ipType: " + ipType;
    }
}
