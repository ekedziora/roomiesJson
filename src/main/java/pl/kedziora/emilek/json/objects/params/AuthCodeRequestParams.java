package pl.kedziora.emilek.json.objects.params;

public class AuthCodeRequestParams {

    private String mail;

    private String authCode;

    public AuthCodeRequestParams() {
    }

    public AuthCodeRequestParams(String mail, String authCode) {
        this.mail = mail;
        this.authCode = authCode;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

}
