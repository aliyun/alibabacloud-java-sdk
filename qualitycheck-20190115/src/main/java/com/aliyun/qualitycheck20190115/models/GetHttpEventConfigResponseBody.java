// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetHttpEventConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHttpEventConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9987D326-83D9-4A42-B9A5-0B27F9B40539</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHttpEventConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHttpEventConfigResponseBody self = new GetHttpEventConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHttpEventConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHttpEventConfigResponseBody setData(GetHttpEventConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHttpEventConfigResponseBodyData getData() {
        return this.data;
    }

    public GetHttpEventConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHttpEventConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHttpEventConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHttpEventConfigResponseBodyDataEventConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ComplaintHandledEvent")
        public Boolean complaintHandledEvent;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FileReviewedEvent")
        public Boolean fileReviewedEvent;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SyncTaskCompleteEvent")
        public Boolean syncTaskCompleteEvent;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TaskCompleteEvent")
        public Boolean taskCompleteEvent;

        public static GetHttpEventConfigResponseBodyDataEventConfig build(java.util.Map<String, ?> map) throws Exception {
            GetHttpEventConfigResponseBodyDataEventConfig self = new GetHttpEventConfigResponseBodyDataEventConfig();
            return TeaModel.build(map, self);
        }

        public GetHttpEventConfigResponseBodyDataEventConfig setComplaintHandledEvent(Boolean complaintHandledEvent) {
            this.complaintHandledEvent = complaintHandledEvent;
            return this;
        }
        public Boolean getComplaintHandledEvent() {
            return this.complaintHandledEvent;
        }

        public GetHttpEventConfigResponseBodyDataEventConfig setFileReviewedEvent(Boolean fileReviewedEvent) {
            this.fileReviewedEvent = fileReviewedEvent;
            return this;
        }
        public Boolean getFileReviewedEvent() {
            return this.fileReviewedEvent;
        }

        public GetHttpEventConfigResponseBodyDataEventConfig setSyncTaskCompleteEvent(Boolean syncTaskCompleteEvent) {
            this.syncTaskCompleteEvent = syncTaskCompleteEvent;
            return this;
        }
        public Boolean getSyncTaskCompleteEvent() {
            return this.syncTaskCompleteEvent;
        }

        public GetHttpEventConfigResponseBodyDataEventConfig setTaskCompleteEvent(Boolean taskCompleteEvent) {
            this.taskCompleteEvent = taskCompleteEvent;
            return this;
        }
        public Boolean getTaskCompleteEvent() {
            return this.taskCompleteEvent;
        }

    }

    public static class GetHttpEventConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://123213.com">http://123213.com</a></p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <strong>example:</strong>
         * <p>&quot;eventConfig&quot;: { &quot;taskCompleteEvent&quot;:true}</p>
         */
        @NameInMap("EventConfig")
        public GetHttpEventConfigResponseBodyDataEventConfig eventConfig;

        /**
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SwitchFlag")
        public Boolean switchFlag;

        public static GetHttpEventConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHttpEventConfigResponseBodyData self = new GetHttpEventConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHttpEventConfigResponseBodyData setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public GetHttpEventConfigResponseBodyData setEventConfig(GetHttpEventConfigResponseBodyDataEventConfig eventConfig) {
            this.eventConfig = eventConfig;
            return this;
        }
        public GetHttpEventConfigResponseBodyDataEventConfig getEventConfig() {
            return this.eventConfig;
        }

        public GetHttpEventConfigResponseBodyData setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public GetHttpEventConfigResponseBodyData setSwitchFlag(Boolean switchFlag) {
            this.switchFlag = switchFlag;
            return this;
        }
        public Boolean getSwitchFlag() {
            return this.switchFlag;
        }

    }

}
