// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLinkeBahamutSubmitreleasebyenvResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<PushLinkeBahamutSubmitreleasebyenvResponseBodyResult> result;

    public static PushLinkeBahamutSubmitreleasebyenvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushLinkeBahamutSubmitreleasebyenvResponseBody self = new PushLinkeBahamutSubmitreleasebyenvResponseBody();
        return TeaModel.build(map, self);
    }

    public PushLinkeBahamutSubmitreleasebyenvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushLinkeBahamutSubmitreleasebyenvResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushLinkeBahamutSubmitreleasebyenvResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public PushLinkeBahamutSubmitreleasebyenvResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PushLinkeBahamutSubmitreleasebyenvResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public PushLinkeBahamutSubmitreleasebyenvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushLinkeBahamutSubmitreleasebyenvResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public PushLinkeBahamutSubmitreleasebyenvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PushLinkeBahamutSubmitreleasebyenvResponseBody setResult(java.util.List<PushLinkeBahamutSubmitreleasebyenvResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<PushLinkeBahamutSubmitreleasebyenvResponseBodyResult> getResult() {
        return this.result;
    }

    public static class PushLinkeBahamutSubmitreleasebyenvResponseBodyResult extends TeaModel {
        @NameInMap("CloudTenantId")
        public String cloudTenantId;

        @NameInMap("CloudTenantName")
        public String cloudTenantName;

        @NameInMap("PreEnvReleaseInfo")
        public String preEnvReleaseInfo;

        @NameInMap("ProdEnvReleaseInfo")
        public String prodEnvReleaseInfo;

        public static PushLinkeBahamutSubmitreleasebyenvResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PushLinkeBahamutSubmitreleasebyenvResponseBodyResult self = new PushLinkeBahamutSubmitreleasebyenvResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PushLinkeBahamutSubmitreleasebyenvResponseBodyResult setCloudTenantId(String cloudTenantId) {
            this.cloudTenantId = cloudTenantId;
            return this;
        }
        public String getCloudTenantId() {
            return this.cloudTenantId;
        }

        public PushLinkeBahamutSubmitreleasebyenvResponseBodyResult setCloudTenantName(String cloudTenantName) {
            this.cloudTenantName = cloudTenantName;
            return this;
        }
        public String getCloudTenantName() {
            return this.cloudTenantName;
        }

        public PushLinkeBahamutSubmitreleasebyenvResponseBodyResult setPreEnvReleaseInfo(String preEnvReleaseInfo) {
            this.preEnvReleaseInfo = preEnvReleaseInfo;
            return this;
        }
        public String getPreEnvReleaseInfo() {
            return this.preEnvReleaseInfo;
        }

        public PushLinkeBahamutSubmitreleasebyenvResponseBodyResult setProdEnvReleaseInfo(String prodEnvReleaseInfo) {
            this.prodEnvReleaseInfo = prodEnvReleaseInfo;
            return this;
        }
        public String getProdEnvReleaseInfo() {
            return this.prodEnvReleaseInfo;
        }

    }

}
