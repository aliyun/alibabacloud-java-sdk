// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetApplyStatusForTryOnResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetApplyStatusForTryOnResponseBodyData data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetApplyStatusForTryOnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplyStatusForTryOnResponseBody self = new GetApplyStatusForTryOnResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplyStatusForTryOnResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApplyStatusForTryOnResponseBody setData(GetApplyStatusForTryOnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApplyStatusForTryOnResponseBodyData getData() {
        return this.data;
    }

    public GetApplyStatusForTryOnResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public GetApplyStatusForTryOnResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetApplyStatusForTryOnResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplyStatusForTryOnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplyStatusForTryOnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetApplyStatusForTryOnResponseBodyData extends TeaModel {
        @NameInMap("Agreement")
        public Boolean agreement;

        @NameInMap("Status")
        public String status;

        public static GetApplyStatusForTryOnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplyStatusForTryOnResponseBodyData self = new GetApplyStatusForTryOnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplyStatusForTryOnResponseBodyData setAgreement(Boolean agreement) {
            this.agreement = agreement;
            return this;
        }
        public Boolean getAgreement() {
            return this.agreement;
        }

        public GetApplyStatusForTryOnResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
