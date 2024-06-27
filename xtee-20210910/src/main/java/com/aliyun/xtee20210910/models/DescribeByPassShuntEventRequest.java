// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeByPassShuntEventRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventId")
    public Long eventId;

    @NameInMap("regId")
    public String regId;

    public static DescribeByPassShuntEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeByPassShuntEventRequest self = new DescribeByPassShuntEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeByPassShuntEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeByPassShuntEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public DescribeByPassShuntEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
