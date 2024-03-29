// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class Aps extends TeaModel {
    @NameInMap("alert")
    public Alert alert;

    @NameInMap("badge")
    public String badge;

    @NameInMap("category")
    public String category;

    @NameInMap("contentAvailable")
    public Integer contentAvailable;

    @NameInMap("interruptionLevel")
    public String interruptionLevel;

    @NameInMap("sound")
    public String sound;

    @NameInMap("threadID")
    public String threadID;

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

    public Aps setInterruptionLevel(String interruptionLevel) {
        this.interruptionLevel = interruptionLevel;
        return this;
    }
    public String getInterruptionLevel() {
        return this.interruptionLevel;
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

}
