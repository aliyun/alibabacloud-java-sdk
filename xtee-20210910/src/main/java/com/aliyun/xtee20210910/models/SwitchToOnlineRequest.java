// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SwitchToOnlineRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventId")
    public Long eventId;

    @NameInMap("regId")
    public String regId;

    public static SwitchToOnlineRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchToOnlineRequest self = new SwitchToOnlineRequest();
        return TeaModel.build(map, self);
    }

    public SwitchToOnlineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SwitchToOnlineRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public SwitchToOnlineRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
