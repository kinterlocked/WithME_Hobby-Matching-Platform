package com.appwithme.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Meet {
    public String mid;
    public String uid;
    public int meetId;
    public String imgUrl;
    public String title;
    public Date meetDate;
    public int meetAge;
    public int numMember;
    public int meetGen;//남 1, 여 2, 무관 0
    public String place; //장소
    //public LatLng placeLatLng;//장소위도경도정보
    public String content;

    //public String hash;
    //public ArrayList<Hobby> hobbyCate;
    public ArrayList<String> hobbyCate = new ArrayList<>();
    public List<Double> latLng= new ArrayList<>();


    public Meet() {
    }

    public Meet(String uid, int meetId, String imgUrl, String title, int meetAge, int numMember, String content) {
        this.uid=uid;
        this.meetId = meetId;
        this.imgUrl = imgUrl;
        this.title = title;
        //this.meetDate = meetDate;
        this.meetAge = meetAge;
        this.numMember = numMember;
        //this.meetGen = meetGen;
        this.content = content;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getMeetId() {
        return meetId;
    }

    public void setMeetId(int meetId) {
        this.meetId = meetId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMeetAge() {
        return meetAge;
    }

    public void setMeetAge(int meetAge) {
        this.meetAge = meetAge;
    }

    public int getNumMember() {
        return numMember;
    }

    public void setNumMember(int numMember) {
        this.numMember = numMember;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getMeetDate() {
        return meetDate;
    }

    public void setMeetDate(Date meetDate) {
        this.meetDate = meetDate;
    }

    public int getMeetGen() {
        return meetGen;
    }

    public void setMeetGen(int meetGen) {
        this.meetGen = meetGen;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public ArrayList<String> getHobbyCate() {
        return hobbyCate;
    }

    public void setHobbyCate(ArrayList<String> hobbyCate) {
        this.hobbyCate = hobbyCate;
    }

    public List<Double> getLatLng() {
        return latLng;
    }

    public void setLatLng(List<Double> latLng) {
        this.latLng = latLng;
    }
}
