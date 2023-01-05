// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class StartJobResponseBody extends TeaModel {
    @NameInMap("CallIds")
    public java.util.List<StartJobResponseBodyCallIds> callIds;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskIds")
    public java.util.List<StartJobResponseBodyTaskIds> taskIds;

    public static StartJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartJobResponseBody self = new StartJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StartJobResponseBody setCallIds(java.util.List<StartJobResponseBodyCallIds> callIds) {
        this.callIds = callIds;
        return this;
    }
    public java.util.List<StartJobResponseBodyCallIds> getCallIds() {
        return this.callIds;
    }

    public StartJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartJobResponseBody setTaskIds(java.util.List<StartJobResponseBodyTaskIds> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<StartJobResponseBodyTaskIds> getTaskIds() {
        return this.taskIds;
    }

    public static class StartJobResponseBodyCallIds extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static StartJobResponseBodyCallIds build(java.util.Map<String, ?> map) throws Exception {
            StartJobResponseBodyCallIds self = new StartJobResponseBodyCallIds();
            return TeaModel.build(map, self);
        }

        public StartJobResponseBodyCallIds setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartJobResponseBodyCallIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class StartJobResponseBodyTaskIds extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static StartJobResponseBodyTaskIds build(java.util.Map<String, ?> map) throws Exception {
            StartJobResponseBodyTaskIds self = new StartJobResponseBodyTaskIds();
            return TeaModel.build(map, self);
        }

        public StartJobResponseBodyTaskIds setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartJobResponseBodyTaskIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
