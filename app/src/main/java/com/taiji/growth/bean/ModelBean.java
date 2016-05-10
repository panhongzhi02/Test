package com.taiji.growth.bean;

/**
 * Created by panho on 2016-05-03.
 */
public class ModelBean {

    private String title;

    private int resid;

    public ModelBean(String title, int resid) {
        this.title = title;
        this.resid = resid;
    }

    public ModelBean() {
    }

    public String getTitle() {
        return title;
    }

    public int getResid() {
        return resid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setResid(int resid) {
        this.resid = resid;
    }

    @Override
    public String toString() {
        return "ModelBean{" +
                "title='" + title + '\'' +
                ", resid='" + resid + '\'' +
                '}';
    }
}
