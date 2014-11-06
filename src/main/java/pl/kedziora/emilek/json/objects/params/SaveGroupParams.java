package pl.kedziora.emilek.json.objects.params;

import pl.kedziora.emilek.json.objects.MemberToAddData;

import java.util.List;

public class SaveGroupParams {

    private String name;

    private String address;

    private List<MemberToAddData> members;

    private RequestParams requestParams;

    public SaveGroupParams() {
    }

    public SaveGroupParams(String name, String address, List<MemberToAddData> members, RequestParams requestParams) {
        this.name = name;
        this.address = address;
        this.members = members;
        this.requestParams = requestParams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<MemberToAddData> getMembers() {
        return members;
    }

    public void setMembers(List<MemberToAddData> members) {
        this.members = members;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }
}
