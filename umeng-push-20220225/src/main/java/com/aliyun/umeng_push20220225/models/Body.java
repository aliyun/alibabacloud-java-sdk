// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class Body extends TeaModel {
    @NameInMap("activity")
    public String activity;

    @NameInMap("addBadge")
    public Integer addBadge;

    @NameInMap("afterOpen")
    public String afterOpen;

    @NameInMap("builderId")
    public Long builderId;

    @NameInMap("custom")
    public String custom;

    @NameInMap("expandImage")
    public String expandImage;

    @NameInMap("icon")
    public String icon;

    @NameInMap("img")
    public String img;

    @NameInMap("playLights")
    public Boolean playLights;

    @NameInMap("playSound")
    public Boolean playSound;

    @NameInMap("playVibrate")
    public Boolean playVibrate;

    @NameInMap("rePop")
    public Integer rePop;

    @NameInMap("setBadge")
    public Integer setBadge;

    @NameInMap("sound")
    public String sound;

    @NameInMap("text")
    public String text;

    @NameInMap("title")
    public String title;

    @NameInMap("url")
    public String url;

    public static Body build(java.util.Map<String, ?> map) throws Exception {
        Body self = new Body();
        return TeaModel.build(map, self);
    }

    public Body setActivity(String activity) {
        this.activity = activity;
        return this;
    }
    public String getActivity() {
        return this.activity;
    }

    public Body setAddBadge(Integer addBadge) {
        this.addBadge = addBadge;
        return this;
    }
    public Integer getAddBadge() {
        return this.addBadge;
    }

    public Body setAfterOpen(String afterOpen) {
        this.afterOpen = afterOpen;
        return this;
    }
    public String getAfterOpen() {
        return this.afterOpen;
    }

    public Body setBuilderId(Long builderId) {
        this.builderId = builderId;
        return this;
    }
    public Long getBuilderId() {
        return this.builderId;
    }

    public Body setCustom(String custom) {
        this.custom = custom;
        return this;
    }
    public String getCustom() {
        return this.custom;
    }

    public Body setExpandImage(String expandImage) {
        this.expandImage = expandImage;
        return this;
    }
    public String getExpandImage() {
        return this.expandImage;
    }

    public Body setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public Body setImg(String img) {
        this.img = img;
        return this;
    }
    public String getImg() {
        return this.img;
    }

    public Body setPlayLights(Boolean playLights) {
        this.playLights = playLights;
        return this;
    }
    public Boolean getPlayLights() {
        return this.playLights;
    }

    public Body setPlaySound(Boolean playSound) {
        this.playSound = playSound;
        return this;
    }
    public Boolean getPlaySound() {
        return this.playSound;
    }

    public Body setPlayVibrate(Boolean playVibrate) {
        this.playVibrate = playVibrate;
        return this;
    }
    public Boolean getPlayVibrate() {
        return this.playVibrate;
    }

    public Body setRePop(Integer rePop) {
        this.rePop = rePop;
        return this;
    }
    public Integer getRePop() {
        return this.rePop;
    }

    public Body setSetBadge(Integer setBadge) {
        this.setBadge = setBadge;
        return this;
    }
    public Integer getSetBadge() {
        return this.setBadge;
    }

    public Body setSound(String sound) {
        this.sound = sound;
        return this;
    }
    public String getSound() {
        return this.sound;
    }

    public Body setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public Body setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Body setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
