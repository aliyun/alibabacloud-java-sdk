// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCloudMonitorEventListResponseBody extends TeaModel {
    @NameInMap("EventList")
    public String eventList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMessageCloudMonitorEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCloudMonitorEventListResponseBody self = new GetMessageCloudMonitorEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageCloudMonitorEventListResponseBody setEventList(String eventList) {
        this.eventList = eventList;
        return this;
    }
    public String getEventList() {
        return this.eventList;
    }

    public GetMessageCloudMonitorEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
