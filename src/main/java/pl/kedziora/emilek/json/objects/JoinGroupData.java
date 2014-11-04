package pl.kedziora.emilek.json.objects;

public class JoinGroupData {

    private String name;

    private String address;

    private String adminName;

    private Long groupId;

    public JoinGroupData() {
    }

    public JoinGroupData(String name, String address, String adminName, Long groupId) {
        this.name = name;
        this.address = address;
        this.adminName = adminName;
        this.groupId = groupId;
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

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
