// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotEventTrendResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<GetHoneypotEventTrendResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHoneypotEventTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotEventTrendResponseBody self = new GetHoneypotEventTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotEventTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneypotEventTrendResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetHoneypotEventTrendResponseBody setData(java.util.List<GetHoneypotEventTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetHoneypotEventTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetHoneypotEventTrendResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneypotEventTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneypotEventTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneypotEventTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneypotEventTrendResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("KeyName")
        public String keyName;

        @NameInMap("TimeStamp")
        public Long timeStamp;

        public static GetHoneypotEventTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotEventTrendResponseBodyData self = new GetHoneypotEventTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHoneypotEventTrendResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetHoneypotEventTrendResponseBodyData setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public GetHoneypotEventTrendResponseBodyData setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

    }

}
