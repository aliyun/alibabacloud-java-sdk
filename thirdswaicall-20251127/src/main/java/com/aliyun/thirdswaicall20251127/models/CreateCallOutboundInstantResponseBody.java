// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127.models;

import com.aliyun.tea.*;

public class CreateCallOutboundInstantResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateCallOutboundInstantResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Timestamp")
    public String timestamp;

    @NameInMap("TraceId")
    public String traceId;

    public static CreateCallOutboundInstantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCallOutboundInstantResponseBody self = new CreateCallOutboundInstantResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCallOutboundInstantResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCallOutboundInstantResponseBody setData(CreateCallOutboundInstantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCallOutboundInstantResponseBodyData getData() {
        return this.data;
    }

    public CreateCallOutboundInstantResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCallOutboundInstantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCallOutboundInstantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateCallOutboundInstantResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public CreateCallOutboundInstantResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateCallOutboundInstantResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>call_123456</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>CALLING</p>
         */
        @NameInMap("CallStatus")
        public String callStatus;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>9B19DF17-D5C4-5893-B8FF-4EBAADCDC6A1</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static CreateCallOutboundInstantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCallOutboundInstantResponseBodyData self = new CreateCallOutboundInstantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCallOutboundInstantResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CreateCallOutboundInstantResponseBodyData setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public CreateCallOutboundInstantResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateCallOutboundInstantResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
