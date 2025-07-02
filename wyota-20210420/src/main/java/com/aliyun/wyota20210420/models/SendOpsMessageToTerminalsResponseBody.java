// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class SendOpsMessageToTerminalsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SendOpsMessageToTerminalsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendOpsMessageToTerminalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendOpsMessageToTerminalsResponseBody self = new SendOpsMessageToTerminalsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendOpsMessageToTerminalsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendOpsMessageToTerminalsResponseBody setData(java.util.List<SendOpsMessageToTerminalsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SendOpsMessageToTerminalsResponseBodyData> getData() {
        return this.data;
    }

    public SendOpsMessageToTerminalsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendOpsMessageToTerminalsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendOpsMessageToTerminalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendOpsMessageToTerminalsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendOpsMessageToTerminalsResponseBodyData extends TeaModel {
        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("Result")
        public String result;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Uuid")
        public String uuid;

        public static SendOpsMessageToTerminalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendOpsMessageToTerminalsResponseBodyData self = new SendOpsMessageToTerminalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendOpsMessageToTerminalsResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public SendOpsMessageToTerminalsResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public SendOpsMessageToTerminalsResponseBodyData setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public SendOpsMessageToTerminalsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public SendOpsMessageToTerminalsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
