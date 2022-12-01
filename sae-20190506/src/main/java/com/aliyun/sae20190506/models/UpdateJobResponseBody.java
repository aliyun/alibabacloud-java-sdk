// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateJobResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static UpdateJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobResponseBody self = new UpdateJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateJobResponseBody setData(UpdateJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateJobResponseBodyData getData() {
        return this.data;
    }

    public UpdateJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateJobResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UpdateJobResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static UpdateJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobResponseBodyData self = new UpdateJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateJobResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateJobResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
