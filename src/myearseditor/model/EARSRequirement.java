/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myearseditor.model;

/**
 *
 * @author Krish
 */
public abstract class EARSRequirement {
    private long _reqId;
    private String _reqType;

    public void setReqId(long _reqId) {
        this._reqId = _reqId;
    }

    public void setReqType(String _reqType) {
        this._reqType = _reqType;
    }

    public String getReqType() {
        return _reqType;
    }
    private enum _reqColorCode{ RED, GREY, GREEN};
    
}
