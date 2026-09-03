// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class Aps extends TeaModel {
    @NameInMap("alert")
    public Alert alert;

    @NameInMap("attributes")
    public String attributes;

    @NameInMap("attributesType")
    public String attributesType;

    /**
     * <strong>example:</strong>
     * <p>+1(自增)，-1(自减)，4(设置数字)</p>
     */
    @NameInMap("badge")
    public String badge;

    @NameInMap("category")
    public String category;

    @NameInMap("contentAvailable")
    public Integer contentAvailable;

    /**
     * <strong>example:</strong>
     * <p>{                  &quot;status&quot;: &quot;shippingbox.fill&quot;                 }</p>
     */
    @NameInMap("contentState")
    public String contentState;

    @NameInMap("dismissalDate")
    public Integer dismissalDate;

    /**
     * <strong>example:</strong>
     * <p>创建:start , 更新:update,结束:end</p>
     */
    @NameInMap("event")
    public String event;

    @NameInMap("interruptionLevel")
    public String interruptionLevel;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("mutableContent")
    public Integer mutableContent;

    @NameInMap("sound")
    public String sound;

    @NameInMap("threadID")
    public String threadID;

    @NameInMap("timestamp")
    public Integer timestamp;

    public static Aps build(java.util.Map<String, ?> map) throws Exception {
        Aps self = new Aps();
        return TeaModel.build(map, self);
    }

    public Aps setAlert(Alert alert) {
        this.alert = alert;
        return this;
    }
    public Alert getAlert() {
        return this.alert;
    }

    public Aps setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public Aps setAttributesType(String attributesType) {
        this.attributesType = attributesType;
        return this;
    }
    public String getAttributesType() {
        return this.attributesType;
    }

    public Aps setBadge(String badge) {
        this.badge = badge;
        return this;
    }
    public String getBadge() {
        return this.badge;
    }

    public Aps setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public Aps setContentAvailable(Integer contentAvailable) {
        this.contentAvailable = contentAvailable;
        return this;
    }
    public Integer getContentAvailable() {
        return this.contentAvailable;
    }

    public Aps setContentState(String contentState) {
        this.contentState = contentState;
        return this;
    }
    public String getContentState() {
        return this.contentState;
    }

    public Aps setDismissalDate(Integer dismissalDate) {
        this.dismissalDate = dismissalDate;
        return this;
    }
    public Integer getDismissalDate() {
        return this.dismissalDate;
    }

    public Aps setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public Aps setInterruptionLevel(String interruptionLevel) {
        this.interruptionLevel = interruptionLevel;
        return this;
    }
    public String getInterruptionLevel() {
        return this.interruptionLevel;
    }

    public Aps setMutableContent(Integer mutableContent) {
        this.mutableContent = mutableContent;
        return this;
    }
    public Integer getMutableContent() {
        return this.mutableContent;
    }

    public Aps setSound(String sound) {
        this.sound = sound;
        return this;
    }
    public String getSound() {
        return this.sound;
    }

    public Aps setThreadID(String threadID) {
        this.threadID = threadID;
        return this;
    }
    public String getThreadID() {
        return this.threadID;
    }

    public Aps setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Integer getTimestamp() {
        return this.timestamp;
    }

}
