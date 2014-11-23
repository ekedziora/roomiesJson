package pl.kedziora.emilek.json.objects.data;

import java.util.List;

public class EditGroupData {

    private String name;

    private String address;

    private MemberToAddData admin;

    private List<MemberToAddData> members;

    private List<MemberToAddData> availableMembers;

    public EditGroupData() {
    }

    public EditGroupData(String name, String address, MemberToAddData admin, List<MemberToAddData> members, List<MemberToAddData> availableMembers) {
        this.name = name;
        this.address = address;
        this.admin = admin;
        this.members = members;
        this.availableMembers = availableMembers;
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

    public List<MemberToAddData> getAvailableMembers() {
        return availableMembers;
    }

    public void setAvailableMembers(List<MemberToAddData> availableMembers) {
        this.availableMembers = availableMembers;
    }
}
