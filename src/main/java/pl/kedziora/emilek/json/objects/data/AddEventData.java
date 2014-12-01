package pl.kedziora.emilek.json.objects.data;

import java.util.List;

public class AddEventData {

    List<MemberToAddData> members;

    public AddEventData() {
    }

    public AddEventData(List<MemberToAddData> members) {
        this.members = members;
    }

    public List<MemberToAddData> getMembers() {
        return members;
    }

    public void setMembers(List<MemberToAddData> members) {
        this.members = members;
    }
}
