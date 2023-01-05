public class Ad {
    private long id;
    private long userId;
    private String title;
    private String description;

    private int stateid;
    private int countyid;

    public Ad(long id, long userId, String title, String description,int stateid, int countyid) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.stateid = stateid;
        this.countyid = countyid;
    }

    public Ad(long userId, String title, String description,int stateid, int countyid) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.stateid = stateid;
        this.countyid = countyid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStateid(int id){
        this.stateid = id;
    }

    public int getStateid() {
        return this.stateid;
    }

    public void setCountyid(int id){
        this.countyid = id;
    }

    public int getCountyid() {
        return this.countyid;
    }
}
