package pl.kedziora.emilek.json.objects.params;

import pl.kedziora.emilek.json.utils.CoreUtils;

public class RequestParams {

    private String mail;

    private String androidClientId;

    public RequestParams() {}

    public RequestParams(String mail) {
        this.mail = mail;
        this.androidClientId = CoreUtils.ANDROID_APP_CLIENT_ID;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAndroidClientId() {
        return androidClientId;
    }

    public void setAndroidClientId(String androidClientId) {
        this.androidClientId = androidClientId;
    }
}
