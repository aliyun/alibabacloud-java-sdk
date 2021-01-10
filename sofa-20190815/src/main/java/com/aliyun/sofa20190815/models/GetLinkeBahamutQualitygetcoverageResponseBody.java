// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutQualitygetcoverageResponseBody extends TeaModel {
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
    public GetLinkeBahamutQualitygetcoverageResponseBodyResult result;

    public static GetLinkeBahamutQualitygetcoverageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutQualitygetcoverageResponseBody self = new GetLinkeBahamutQualitygetcoverageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutQualitygetcoverageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutQualitygetcoverageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutQualitygetcoverageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutQualitygetcoverageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutQualitygetcoverageResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutQualitygetcoverageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutQualitygetcoverageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutQualitygetcoverageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutQualitygetcoverageResponseBody setResult(GetLinkeBahamutQualitygetcoverageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutQualitygetcoverageResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutQualitygetcoverageResponseBodyResult extends TeaModel {
        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public String status;

        public static GetLinkeBahamutQualitygetcoverageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutQualitygetcoverageResponseBodyResult self = new GetLinkeBahamutQualitygetcoverageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutQualitygetcoverageResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetLinkeBahamutQualitygetcoverageResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
