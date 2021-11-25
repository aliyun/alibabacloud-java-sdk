// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class ListHotlineRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListHotlineRecordResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListHotlineRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordResponseBody self = new ListHotlineRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotlineRecordResponseBody setData(java.util.List<ListHotlineRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListHotlineRecordResponseBodyData> getData() {
        return this.data;
    }

    public ListHotlineRecordResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHotlineRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotlineRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotlineRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHotlineRecordResponseBodyData extends TeaModel {
        @NameInMap("CallId")
        public String callId;

        @NameInMap("ConnectionId")
        public String connectionId;

        @NameInMap("EndTime")
        public Boolean endTime;

        @NameInMap("StartTime")
        public Boolean startTime;

        @NameInMap("Url")
        public String url;

        public static ListHotlineRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineRecordResponseBodyData self = new ListHotlineRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotlineRecordResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListHotlineRecordResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public ListHotlineRecordResponseBodyData setEndTime(Boolean endTime) {
            this.endTime = endTime;
            return this;
        }
        public Boolean getEndTime() {
            return this.endTime;
        }

        public ListHotlineRecordResponseBodyData setStartTime(Boolean startTime) {
            this.startTime = startTime;
            return this;
        }
        public Boolean getStartTime() {
            return this.startTime;
        }

        public ListHotlineRecordResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
