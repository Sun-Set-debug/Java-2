/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuche
 */
public class Verdict {
    private String caseName;
    private String studentVerdict;
    private String reason;
    Verdict(){
        this.caseName = "No name";
        this.studentVerdict = "No verdict";
        this.reason = "No reason";
    }
    Verdict(String caseName, String studentVerdict, String reason){
        this.caseName = caseName;
        this.studentVerdict = studentVerdict;
        this.reason = reason;
    }
    public void setCaseName(String caseName){
        this.caseName = caseName;
    }
    public String getCaseName(){
        return caseName;
    }
    public void setStudentVerdict(String studentVerdict){
        this.studentVerdict = studentVerdict;
    }
    public String getStudentVerdict(){
        return studentVerdict;
    }
    public void setReason(String reason){
        this.reason = reason;
    }
    public String getReason(){
        return reason;
    }
    @Override
    public String toString(){
        return "Case name: " + caseName + ", student verdict: " + studentVerdict + ", reason: " + reason;
    }
}
