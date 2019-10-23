package realTime.model;

public class Command {
    private String id;
    private String payload;
    private String type;
    private int createTime;

    public Command() { }

    public Command(String id, String payload, String type, int createTime) {
        this.id = id;
        this.payload = payload;
        this.type = type;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }
}
