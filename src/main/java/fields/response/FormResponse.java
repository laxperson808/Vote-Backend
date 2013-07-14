package fields.response;

import java.util.ArrayList;

/**
 * Author: Andrew Hanes
 * Date: 7/13/13
 * Time: 6:47 PM
 */
public class FormResponse {
    private ArrayList<FieldResponse> resp;
    public FormResponse(ArrayList<FieldResponse> r) {
        this.resp = (ArrayList<FieldResponse>) r.clone();
    }

    public FormResponse() {
        this.resp = new ArrayList<FieldResponse>();
    }

    void addFieldResponse(int index, FieldResponse r) {
        this.resp.add(index, r);
    }

    void addFieldResponse(FieldResponse r) {
        this.resp.add(r);
    }

    public FieldResponse getFieldResponse(int index) {
        return resp.get(index);
    }

    public int getSize() {
        return this.resp.size();
    }
}