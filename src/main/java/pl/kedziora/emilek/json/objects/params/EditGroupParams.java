package pl.kedziora.emilek.json.objects.params;

import pl.kedziora.emilek.json.objects.MemberToAddData;

import java.util.List;

public class EditGroupParams {

    private String name;

    private String address;

    private MemberToAddData admin;

    private List<MemberToAddData> members;

    private RequestParams requestParams;

    public EditGroupParams() {
    }

    public EditGroupParams(String name, String address, MemberToAddData admin, List<MemberToAddData> members, RequestParams requestParams) {
        this.name = name;
        this.address = address;
        this.admin = admin;
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

    public MemberToAddData getAdmin() {
        return admin;
    }

    public void setAdmin(MemberToAddData admin) {
        this.admin = admin;
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
