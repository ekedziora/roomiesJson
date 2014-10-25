package pl.kedziora.emilek.json.objects;

import com.google.gson.annotations.SerializedName;

public class GoogleErrorResponse {

    private String error;

    @SerializedName("error_description")
    private String errorDescription;

    public GoogleErrorResponse() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

}
