// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStcresultResponseBody extends TeaModel {
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
    public GetLinkeBahamutStcresultResponseBodyResult result;

    public static GetLinkeBahamutStcresultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStcresultResponseBody self = new GetLinkeBahamutStcresultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStcresultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutStcresultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutStcresultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutStcresultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutStcresultResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutStcresultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutStcresultResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutStcresultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutStcresultResponseBody setResult(GetLinkeBahamutStcresultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutStcresultResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutStcresultResponseBodyResult extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ErrorMes")
        public String errorMes;

        @NameInMap("Result")
        public String result;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetLinkeBahamutStcresultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutStcresultResponseBodyResult self = new GetLinkeBahamutStcresultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutStcresultResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutStcresultResponseBodyResult setErrorMes(String errorMes) {
            this.errorMes = errorMes;
            return this;
        }
        public String getErrorMes() {
            return this.errorMes;
        }

        public GetLinkeBahamutStcresultResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetLinkeBahamutStcresultResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetLinkeBahamutStcresultResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
