// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class Message2ThirdChannel extends TeaModel {
    @NameInMap("SetBadge")
    public Long setBadge;

    @NameInMap("addBadge")
    public Long addBadge;

    @NameInMap("bigBody")
    public String bigBody;

    @NameInMap("bigTitle")
    public String bigTitle;

    @NameInMap("expandImage")
    public String expandImage;

    @NameInMap("img")
    public String img;

    @NameInMap("sound")
    public String sound;

    @NameInMap("text")
    public String text;

    @NameInMap("title")
    public String title;

    public static Message2ThirdChannel build(java.util.Map<String, ?> map) throws Exception {
        Message2ThirdChannel self = new Message2ThirdChannel();
        return TeaModel.build(map, self);
    }

    public Message2ThirdChannel setSetBadge(Long setBadge) {
        this.setBadge = setBadge;
        return this;
    }
    public Long getSetBadge() {
        return this.setBadge;
    }

    public Message2ThirdChannel setAddBadge(Long addBadge) {
        this.addBadge = addBadge;
        return this;
    }
    public Long getAddBadge() {
        return this.addBadge;
    }

    public Message2ThirdChannel setBigBody(String bigBody) {
        this.bigBody = bigBody;
        return this;
    }
    public String getBigBody() {
        return this.bigBody;
    }

    public Message2ThirdChannel setBigTitle(String bigTitle) {
        this.bigTitle = bigTitle;
        return this;
    }
    public String getBigTitle() {
        return this.bigTitle;
    }

    public Message2ThirdChannel setExpandImage(String expandImage) {
        this.expandImage = expandImage;
        return this;
    }
    public String getExpandImage() {
        return this.expandImage;
    }

    public Message2ThirdChannel setImg(String img) {
        this.img = img;
        return this;
    }
    public String getImg() {
        return this.img;
    }

    public Message2ThirdChannel setSound(String sound) {
        this.sound = sound;
        return this;
    }
    public String getSound() {
        return this.sound;
    }

    public Message2ThirdChannel setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public Message2ThirdChannel setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
