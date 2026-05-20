/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuche
 */
class PrivacyCase extends EthicsCase{
    private String dataType;
    PrivacyCase(String caseTitle, String description, String dataType){
        super(caseTitle, description, "PrivacyCase");
        this.dataType = dataType;
    }
    public String getDataType(){
        return dataType;
    }
    @Override
    public String toString(){
        return super.toString() + ", data type :" + dataType;
    }
}
