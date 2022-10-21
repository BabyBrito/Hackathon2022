package hackProject.Hackathon.Project;

public class Note {
    private String noteID;
    private String createdBy;
    private String dateCreated;
    private String noteHeader;
    private String noteBody;

    public Note(String noteID, String createdBy, String dateCreated, String noteHeader, String noteBody) {
        this.noteID = noteID;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
        this.noteHeader = noteHeader;
        this.noteBody = noteBody;
    }

    public Note() {

    }

    public String getNoteID() {
        return noteID;
    }

    public void setNoteID(String noteID) {
        this.noteID = noteID;
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

    public String getNoteHeader() {
        return noteHeader;
    }

    public void setNoteHeader(String noteHeader) {
        this.noteHeader = noteHeader;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }
}
