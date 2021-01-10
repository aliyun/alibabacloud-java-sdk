// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetappsResponseBody extends TeaModel {
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
    public GetLinkeBahamutPaasgetappsResponseBodyResult result;

    public static GetLinkeBahamutPaasgetappsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetappsResponseBody self = new GetLinkeBahamutPaasgetappsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetappsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutPaasgetappsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutPaasgetappsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutPaasgetappsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutPaasgetappsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutPaasgetappsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutPaasgetappsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutPaasgetappsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutPaasgetappsResponseBody setResult(GetLinkeBahamutPaasgetappsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutPaasgetappsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutPaasgetappsResponseBodyResult extends TeaModel {
        @NameInMap("Apps")
        public String apps;

        @NameInMap("Tenant")
        public String tenant;

        public static GetLinkeBahamutPaasgetappsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutPaasgetappsResponseBodyResult self = new GetLinkeBahamutPaasgetappsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutPaasgetappsResponseBodyResult setApps(String apps) {
            this.apps = apps;
            return this;
        }
        public String getApps() {
            return this.apps;
        }

        public GetLinkeBahamutPaasgetappsResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

    }

}
