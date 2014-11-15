package pl.kedziora.emilek.json.objects.data;

import java.util.List;

public class EditGroupData {

    private String name;

    private String address;

    private List<MemberToAddData> members;

    private List<MemberToAddData> availableMembers;

    public EditGroupData() {
    }

    public EditGroupData(String name, String address, List<MemberToAddData> members, List<MemberToAddData> availableMembers) {
        this.name = name;
        this.address = address;
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
