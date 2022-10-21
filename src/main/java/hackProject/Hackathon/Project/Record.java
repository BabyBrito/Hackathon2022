package hackProject.Hackathon.Project;

public class Record {
    private String recordID;
    private String dateCreated;
    private boolean monetary;
    private boolean authenticated;
    private String urgency;

    public Record(String recordID, String dateCreated, boolean monetary, boolean authenticated, String urgency) {
        this.recordID = recordID;
        this.dateCreated = dateCreated;
        this.monetary = monetary;
        this.authenticated = authenticated;
        this.urgency = urgency;
    }

    public Record() {

    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isMonetary() {
        return monetary;
    }

    public void setMonetary(boolean monetary) {
        this.monetary = monetary;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
}
