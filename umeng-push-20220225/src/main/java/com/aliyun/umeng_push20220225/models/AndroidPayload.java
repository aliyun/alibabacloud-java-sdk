// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class AndroidPayload extends TeaModel {
    @NameInMap("body")
    public Body body;

    @NameInMap("displayType")
    public String displayType;

    @NameInMap("extra")
    public java.util.Map<String, ?> extra;

    @NameInMap("message2ThirdChannel")
    public Message2ThirdChannel message2ThirdChannel;

    public static AndroidPayload build(java.util.Map<String, ?> map) throws Exception {
        AndroidPayload self = new AndroidPayload();
        return TeaModel.build(map, self);
    }

    public AndroidPayload setBody(Body body) {
        this.body = body;
        return this;
    }
    public Body getBody() {
        return this.body;
    }

    public AndroidPayload setDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }
    public String getDisplayType() {
        return this.displayType;
    }

    public AndroidPayload setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public AndroidPayload setMessage2ThirdChannel(Message2ThirdChannel message2ThirdChannel) {
        this.message2ThirdChannel = message2ThirdChannel;
        return this;
    }
    public Message2ThirdChannel getMessage2ThirdChannel() {
        return this.message2ThirdChannel;
    }

}
