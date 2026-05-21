/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The Verdict class represents a student's decision
 * and reasoning for an ethics case.
 * 
 * It stores the case name, the student's verdict
 * (e.g., Ethical/Unethical), and the reason for that decision.
 */
public class Verdict {

    // Name of the case associated with this verdict
    private String caseName;

    // Student's decision for the case (e.g., Ethical / Unethical)
    private String studentVerdict;

    // Reason provided by the student for their decision
    private String reason;

    /**
     * Default constructor.
     * Initializes fields with placeholder values.
     */
    Verdict() {
        this.caseName = "No name";
        this.studentVerdict = "No verdict";
        this.reason = "No reason";
    }

    /**
     * Constructor with parameters.
     * 
     * @param caseName        the name of the case
     * @param studentVerdict  the student's decision
     * @param reason          the reason for the decision
     */
    Verdict(String caseName, String studentVerdict, String reason) {
        this.caseName = caseName;
        this.studentVerdict = studentVerdict;
        this.reason = reason;
    }

    /**
     * Sets the case name.
     * 
     * @param caseName the name of the case
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    /**
     * Gets the case name.
     * 
     * @return the case name
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * Sets the student's verdict.
     * 
     * @param studentVerdict the decision (Ethical/Unethical)
     */
    public void setStudentVerdict(String studentVerdict) {
        this.studentVerdict = studentVerdict;
    }

    /**
     * Gets the student's verdict.
     * 
     * @return the student's verdict
     */
    public String getStudentVerdict() {
        return studentVerdict;
    }

    /**
     * Sets the reason for the verdict.
     * 
     * @param reason explanation for the decision
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Gets the reason for the verdict.
     * 
     * @return the reason string
     */
    public String getReason() {
        return reason;
    }

    /**
     * Returns a string representation of the Verdict object.
     * 
     * @return formatted verdict information
     */
    @Override
    public String toString() {
        return "Case name: " + caseName
                + ", student verdict: " + studentVerdict
                + ", reason: " + reason;
    }
}
