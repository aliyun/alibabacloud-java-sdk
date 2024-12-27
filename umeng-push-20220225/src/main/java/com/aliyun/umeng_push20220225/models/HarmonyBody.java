// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class HarmonyBody extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("addBadge")
    public Integer addBadge;

    @NameInMap("afterOpen")
    public String afterOpen;

    @NameInMap("bigBody")
    public String bigBody;

    @NameInMap("custom")
    public String custom;

    @NameInMap("img")
    public String img;

    @NameInMap("largeIcon")
    public String largeIcon;

    @NameInMap("text")
    public String text;

    @NameInMap("title")
    public String title;

    @NameInMap("uri")
    public String uri;

    public static HarmonyBody build(java.util.Map<String, ?> map) throws Exception {
        HarmonyBody self = new HarmonyBody();
        return TeaModel.build(map, self);
    }

    public HarmonyBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public HarmonyBody setAddBadge(Integer addBadge) {
        this.addBadge = addBadge;
        return this;
    }
    public Integer getAddBadge() {
        return this.addBadge;
    }

    public HarmonyBody setAfterOpen(String afterOpen) {
        this.afterOpen = afterOpen;
        return this;
    }
    public String getAfterOpen() {
        return this.afterOpen;
    }

    public HarmonyBody setBigBody(String bigBody) {
        this.bigBody = bigBody;
        return this;
    }
    public String getBigBody() {
        return this.bigBody;
    }

    public HarmonyBody setCustom(String custom) {
        this.custom = custom;
        return this;
    }
    public String getCustom() {
        return this.custom;
    }

    public HarmonyBody setImg(String img) {
        this.img = img;
        return this;
    }
    public String getImg() {
        return this.img;
    }

    public HarmonyBody setLargeIcon(String largeIcon) {
        this.largeIcon = largeIcon;
        return this;
    }
    public String getLargeIcon() {
        return this.largeIcon;
    }

    public HarmonyBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public HarmonyBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public HarmonyBody setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
