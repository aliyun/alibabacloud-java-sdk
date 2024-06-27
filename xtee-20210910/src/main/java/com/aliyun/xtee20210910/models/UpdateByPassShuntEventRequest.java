// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateByPassShuntEventRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventId")
    public Long eventId;

    @NameInMap("eventName")
    public String eventName;

    @NameInMap("regId")
    public String regId;

    public static UpdateByPassShuntEventRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateByPassShuntEventRequest self = new UpdateByPassShuntEventRequest();
        return TeaModel.build(map, self);
    }

    public UpdateByPassShuntEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateByPassShuntEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public UpdateByPassShuntEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public UpdateByPassShuntEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
