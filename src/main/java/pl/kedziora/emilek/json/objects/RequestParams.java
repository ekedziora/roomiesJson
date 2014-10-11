package pl.kedziora.emilek.json.objects;

import pl.kedziora.emilek.json.utils.CoreUtils;

public class RequestParams {

    private String mail;

    private String androidClientId = CoreUtils.ANDROID_APP_CLIENT_ID;

    public RequestParams() {}

    public RequestParams(String mail) {
        this.mail = mail;
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
