// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackEventListResponseBody extends TeaModel {
    @NameInMap("EventList")
    public String eventList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMessageCallbackEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCallbackEventListResponseBody self = new GetMessageCallbackEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageCallbackEventListResponseBody setEventList(String eventList) {
        this.eventList = eventList;
        return this;
    }
    public String getEventList() {
        return this.eventList;
    }

    public GetMessageCallbackEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
