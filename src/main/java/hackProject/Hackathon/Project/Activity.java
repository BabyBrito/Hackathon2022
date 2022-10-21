package hackProject.Hackathon.Project;

public class Activity {
    private String activityID;
    private String createdBy;
    private String dateCreated;
    private boolean inPerson;
    private String interactionType;

    public Activity(String activityID, String createdBy, String dateCreated, boolean inPerson, String interactionType) {
        this.activityID = activityID;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
        this.inPerson = inPerson;
        this.interactionType = interactionType;
    }

    public Activity() {

    }

    public String getActivityID() {
        return activityID;
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isInPerson() {
        return inPerson;
    }

    public void setInPerson(boolean inPerson) {
        this.inPerson = inPerson;
    }

    public String getInteractionType() {
        return interactionType;
    }

    public void setInteractionType(String interactionType) {
        this.interactionType = interactionType;
    }
}
