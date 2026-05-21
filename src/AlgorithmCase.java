/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuche
 */
class AlgorithmCase extends EthicsCase {
    private String biasType;
    public AlgorithmCase(String caseTitle, String description, String biasType){
        super(caseTitle, description, "AlgorithmCase");
        this.biasType = biasType;
        this.verdict = new Verdict();
    }
    public String getBiasType(){
        return biasType;
    }
    @Override
    public String toString(){
        return super.toString() + ", bias type: " + biasType;
    }
}
