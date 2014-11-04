package pl.kedziora.emilek.json.objects;

import java.util.List;

public class MyGroupData {

    private String name;

    private String address;

    private String admin;

    private List<GroupMember> members;

    public MyGroupData() {
    }

    public MyGroupData(String name, String address, String admin, List<GroupMember> members) {
        this.name = name;
        this.address = address;
        this.admin = admin;
        this.members = members;
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

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public List<GroupMember> getMembers() {
        return members;
    }

    public void setMembers(List<GroupMember> members) {
        this.members = members;
    }
}
