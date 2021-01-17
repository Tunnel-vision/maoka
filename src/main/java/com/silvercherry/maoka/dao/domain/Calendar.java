package com.silvercherry.maoka.dao.domain;

public class Calendar {

    private Integer id;
    private String sid;
    private String tts;
    private String content;
    private String note;
    private Integer love;
    private String translation;
    private String small_picture;
    private String picture;
    private String caption;
    private String dateline;
    private Integer s_pv;
    private Integer sp_pv;
    private String fenxiang_img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getTts() {
        return tts;
    }

    public void setTts(String tts) {
        this.tts = tts;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getLove() {
        return love;
    }

    public void setLove(Integer love) {
        this.love = love;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getSmall_picture() {
        return small_picture;
    }

    public void setSmall_picture(String small_picture) {
        this.small_picture = small_picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDateline() {
        return dateline;
    }

    public void setDateline(String dateline) {
        this.dateline = dateline;
    }

    public Integer getS_pv() {
        return s_pv;
    }

    public void setS_pv(Integer s_pv) {
        this.s_pv = s_pv;
    }

    public Integer getSp_pv() {
        return sp_pv;
    }

    public void setSp_pv(Integer sp_pv) {
        this.sp_pv = sp_pv;
    }

    public String getFenxiang_img() {
        return fenxiang_img;
    }

    public void setFenxiang_img(String fenxiang_img) {
        this.fenxiang_img = fenxiang_img;
    }

    @Override
    public String toString() {
        return "Calendar{" +
            "id=" + id +
            ", sid='" + sid + '\'' +
            ", tts='" + tts + '\'' +
            ", content='" + content + '\'' +
            ", note='" + note + '\'' +
            ", love=" + love +
            ", translation='" + translation + '\'' +
            ", small_picture='" + small_picture + '\'' +
            ", picture='" + picture + '\'' +
            ", caption='" + caption + '\'' +
            ", dateline='" + dateline + '\'' +
            ", s_pv=" + s_pv +
            ", sp_pv=" + sp_pv +
            ", fenxiang_img='" + fenxiang_img + '\'' +
            '}';
    }
}
