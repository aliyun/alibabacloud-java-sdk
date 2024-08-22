// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trafficfxopen20240815.models;

import com.aliyun.tea.*;

public class GetTokenResponseBody extends TeaModel {
    @NameInMap("data")
    public GetTokenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorData")
    public GetTokenResponseBodyErrorData errorData;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6BD708D6-1A8C-5CF9-85B8-D620F314F1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>confirmed</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenResponseBody self = new GetTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenResponseBody setData(GetTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTokenResponseBodyData getData() {
        return this.data;
    }

    public GetTokenResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTokenResponseBody setErrorData(GetTokenResponseBodyErrorData errorData) {
        this.errorData = errorData;
        return this;
    }
    public GetTokenResponseBodyErrorData getErrorData() {
        return this.errorData;
    }

    public GetTokenResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTokenResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>1724130275</p>
         */
        @NameInMap("generateTime")
        public String generateTime;

        /**
         * <p>token</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbGciOiJSUzI1NiIsImtpZCI6ImRpc3RyaWJ1dGlvbl9rZXlpZCJ9.eyJqdGkiOiI2cDQwZDctSDQ0dUJicEJkYTZadzdBIiwiaWF0IjoxNzI0MzE2MzM1LCJleHAiOjE3MjQzMjM1MzUsIm5iZiI6MTcyNDMxNjI3NSwiYXBwS2V5IjoiNjE3NzgxZDQxM2FmNGRlZGFiNzkifQ.XtjSM7qVbESvt7n31RtD5Pp6854IVyGMEco4aEruMDMkrXHkcdZejyecKFx3RdsCldZPgvowc5EOl44c3JJfm6DENH4M6BRBSc90eqXYcD_xVJ9FhDWzK9O6OnkvR7HX1t-qqMdikLviM1w1G0DGMLaasvZ8MPMewL8k6NnvOSGePwUhb-m5IZ14VYv7BPO2dp8Jh00qNSJQrmNiWWzJUtK_xllNr3LKQ7cIVtPgFUckvRDw9Hal5oACXSRdkZFOAGlFSjpB_BbTpe5vc-AJ8K89nRD53sIy9YyVQClV_HH7PrXxFFJgReGvNsnP1h9gf55q86IzOQBkj9vGm2zXdw</p>
         */
        @NameInMap("token")
        public String token;

        public static GetTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTokenResponseBodyData self = new GetTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTokenResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetTokenResponseBodyData setGenerateTime(String generateTime) {
            this.generateTime = generateTime;
            return this;
        }
        public String getGenerateTime() {
            return this.generateTime;
        }

        public GetTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class GetTokenResponseBodyErrorData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("rawErrorCode")
        public String rawErrorCode;

        @NameInMap("rawErrorMsg")
        public String rawErrorMsg;

        public static GetTokenResponseBodyErrorData build(java.util.Map<String, ?> map) throws Exception {
            GetTokenResponseBodyErrorData self = new GetTokenResponseBodyErrorData();
            return TeaModel.build(map, self);
        }

        public GetTokenResponseBodyErrorData setRawErrorCode(String rawErrorCode) {
            this.rawErrorCode = rawErrorCode;
            return this;
        }
        public String getRawErrorCode() {
            return this.rawErrorCode;
        }

        public GetTokenResponseBodyErrorData setRawErrorMsg(String rawErrorMsg) {
            this.rawErrorMsg = rawErrorMsg;
            return this;
        }
        public String getRawErrorMsg() {
            return this.rawErrorMsg;
        }

    }

}
