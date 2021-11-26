// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeployApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeployApplicationResponseBodyData data;

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

    public static DeployApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationResponseBody self = new DeployApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeployApplicationResponseBody setData(DeployApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeployApplicationResponseBodyData getData() {
        return this.data;
    }

    public DeployApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeployApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeployApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeployApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeployApplicationResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("IsNeedApproval")
        public Boolean isNeedApproval;

        public static DeployApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeployApplicationResponseBodyData self = new DeployApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeployApplicationResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DeployApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public DeployApplicationResponseBodyData setIsNeedApproval(Boolean isNeedApproval) {
            this.isNeedApproval = isNeedApproval;
            return this;
        }
        public Boolean getIsNeedApproval() {
            return this.isNeedApproval;
        }

    }

}
