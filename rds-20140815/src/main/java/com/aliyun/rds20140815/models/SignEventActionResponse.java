// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SignEventActionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EventId")
    @Validation(required = true)
    public String eventId;

    @NameInMap("EventRcpt")
    @Validation(required = true)
    public String eventRcpt;

    public static SignEventActionResponse build(java.util.Map<String, ?> map) throws Exception {
        SignEventActionResponse self = new SignEventActionResponse();
        return TeaModel.build(map, self);
    }

    public SignEventActionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SignEventActionResponse setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public SignEventActionResponse setEventRcpt(String eventRcpt) {
        this.eventRcpt = eventRcpt;
        return this;
    }
    public String getEventRcpt() {
        return this.eventRcpt;
    }

}
