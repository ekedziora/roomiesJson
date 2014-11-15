package pl.kedziora.emilek.json.objects.data;

import java.util.List;

public class GroupData {

    private String name;

    private String address;

    private String admin;

    private boolean currentUserAdmin;

    private List<GroupMemberData> members;

    public GroupData() {
    }

    public GroupData(String name, String address, String admin, boolean currentUserAdmin, List<GroupMemberData> members) {
        this.name = name;
        this.address = address;
        this.admin = admin;
        this.currentUserAdmin = currentUserAdmin;
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

    public boolean isCurrentUserAdmin() {
        return currentUserAdmin;
    }

    public void setCurrentUserAdmin(boolean currentUserAdmin) {
        this.currentUserAdmin = currentUserAdmin;
    }

    public List<GroupMemberData> getMembers() {
        return members;
    }

    public void setMembers(List<GroupMemberData> members) {
        this.members = members;
    }
}
