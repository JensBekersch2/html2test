package models;

import java.sql.Timestamp;

public class Page {

    private int id;
    private String pageName;
    private String url;
    private Timestamp lastCrawledDate;

    public Page() {}

    public Page(int id, String pageName, String url, Timestamp lastCrawledDate) {
        this.id = id;
        this.pageName = pageName;
        this.url = url;
        this.lastCrawledDate = lastCrawledDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getLastCrawledDate() {
        return lastCrawledDate;
    }

    public void setLastCrawledDate(Timestamp lastCrawledDate) {
        this.lastCrawledDate = lastCrawledDate;
    }
}
