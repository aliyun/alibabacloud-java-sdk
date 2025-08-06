// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCloudMonitorConfigResponseBody extends TeaModel {
    @NameInMap("MessageCloudMonitorConfig")
    public GetMessageCloudMonitorConfigResponseBodyMessageCloudMonitorConfig messageCloudMonitorConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMessageCloudMonitorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCloudMonitorConfigResponseBody self = new GetMessageCloudMonitorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageCloudMonitorConfigResponseBody setMessageCloudMonitorConfig(GetMessageCloudMonitorConfigResponseBodyMessageCloudMonitorConfig messageCloudMonitorConfig) {
        this.messageCloudMonitorConfig = messageCloudMonitorConfig;
        return this;
    }
    public GetMessageCloudMonitorConfigResponseBodyMessageCloudMonitorConfig getMessageCloudMonitorConfig() {
        return this.messageCloudMonitorConfig;
    }

    public GetMessageCloudMonitorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMessageCloudMonitorConfigResponseBodyMessageCloudMonitorConfig extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("EventTypeList")
        public String eventTypeList;

        public static GetMessageCloudMonitorConfigResponseBodyMessageCloudMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMessageCloudMonitorConfigResponseBodyMessageCloudMonitorConfig self = new GetMessageCloudMonitorConfigResponseBodyMessageCloudMonitorConfig();
            return TeaModel.build(map, self);
        }

        public GetMessageCloudMonitorConfigResponseBodyMessageCloudMonitorConfig setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetMessageCloudMonitorConfigResponseBodyMessageCloudMonitorConfig setEventTypeList(String eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public String getEventTypeList() {
            return this.eventTypeList;
        }

    }

}
