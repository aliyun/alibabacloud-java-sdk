// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class StartOrStopByPassShuntEventRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventId")
    public Long eventId;

    @NameInMap("regId")
    public String regId;

    @NameInMap("status")
    public String status;

    public static StartOrStopByPassShuntEventRequest build(java.util.Map<String, ?> map) throws Exception {
        StartOrStopByPassShuntEventRequest self = new StartOrStopByPassShuntEventRequest();
        return TeaModel.build(map, self);
    }

    public StartOrStopByPassShuntEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public StartOrStopByPassShuntEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public StartOrStopByPassShuntEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public StartOrStopByPassShuntEventRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
