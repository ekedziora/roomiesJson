package pl.kedziora.emilek.json.objects.data;

import java.util.List;

public class AnnouncementsData {

    private List<SingleAnnouncementData> announcements;

    private Long currentUserId;

    public AnnouncementsData() {
    }

    public AnnouncementsData(List<SingleAnnouncementData> announcements, Long currentUserId) {
        this.announcements = announcements;
        this.currentUserId = currentUserId;
    }

    public List<SingleAnnouncementData> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<SingleAnnouncementData> announcements) {
        this.announcements = announcements;
    }

    public Long getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(Long currentUserId) {
        this.currentUserId = currentUserId;
    }
}
