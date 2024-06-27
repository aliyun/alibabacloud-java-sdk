// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteByPassShuntEventRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventId")
    public Long eventId;

    @NameInMap("regId")
    public String regId;

    public static DeleteByPassShuntEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteByPassShuntEventRequest self = new DeleteByPassShuntEventRequest();
        return TeaModel.build(map, self);
    }

    public DeleteByPassShuntEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteByPassShuntEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public DeleteByPassShuntEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
