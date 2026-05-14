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
    AlgorithmCase(String caseTitle, String description, String biasType){
        super(caseTitle, description, "catagoty");
        this.biasType = biasType;
    }
    public String getBiasType(){
        return biasType;
    }
    @Override
    public String toString(){
        return super.toString() + ", bias type: " + biasType;
    }
}
