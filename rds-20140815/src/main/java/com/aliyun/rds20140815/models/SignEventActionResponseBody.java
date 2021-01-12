// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SignEventActionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("EventRcpt")
    public String eventRcpt;

    public static SignEventActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SignEventActionResponseBody self = new SignEventActionResponseBody();
        return TeaModel.build(map, self);
    }

    public SignEventActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SignEventActionResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public SignEventActionResponseBody setEventRcpt(String eventRcpt) {
        this.eventRcpt = eventRcpt;
        return this;
    }
    public String getEventRcpt() {
        return this.eventRcpt;
    }

}
