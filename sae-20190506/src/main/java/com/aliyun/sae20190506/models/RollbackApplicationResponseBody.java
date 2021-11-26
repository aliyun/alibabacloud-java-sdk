// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RollbackApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RollbackApplicationResponseBodyData data;

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

    public static RollbackApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationResponseBody self = new RollbackApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RollbackApplicationResponseBody setData(RollbackApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RollbackApplicationResponseBodyData getData() {
        return this.data;
    }

    public RollbackApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RollbackApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RollbackApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RollbackApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class RollbackApplicationResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("IsNeedApproval")
        public Boolean isNeedApproval;

        public static RollbackApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RollbackApplicationResponseBodyData self = new RollbackApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RollbackApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public RollbackApplicationResponseBodyData setIsNeedApproval(Boolean isNeedApproval) {
            this.isNeedApproval = isNeedApproval;
            return this;
        }
        public Boolean getIsNeedApproval() {
            return this.isNeedApproval;
        }

    }

}
