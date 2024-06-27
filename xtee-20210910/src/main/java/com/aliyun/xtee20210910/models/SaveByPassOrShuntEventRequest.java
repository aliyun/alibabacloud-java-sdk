// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SaveByPassOrShuntEventRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventId")
    public Long eventId;

    @NameInMap("eventName")
    public String eventName;

    @NameInMap("eventType")
    public String eventType;

    @NameInMap("regId")
    public String regId;

    public static SaveByPassOrShuntEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveByPassOrShuntEventRequest self = new SaveByPassOrShuntEventRequest();
        return TeaModel.build(map, self);
    }

    public SaveByPassOrShuntEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveByPassOrShuntEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public SaveByPassOrShuntEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public SaveByPassOrShuntEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public SaveByPassOrShuntEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
