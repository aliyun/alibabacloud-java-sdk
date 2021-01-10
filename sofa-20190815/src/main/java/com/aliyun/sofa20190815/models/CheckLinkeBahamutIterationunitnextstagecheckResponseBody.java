// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutIterationunitnextstagecheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult result;

    public static CheckLinkeBahamutIterationunitnextstagecheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutIterationunitnextstagecheckResponseBody self = new CheckLinkeBahamutIterationunitnextstagecheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody setResult(CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult extends TeaModel {
        @NameInMap("BatchGuardCheckResult")
        public String batchGuardCheckResult;

        @NameInMap("WarnContent")
        public java.util.List<String> warnContent;

        @NameInMap("Content")
        public java.util.List<String> content;

        @NameInMap("Passed")
        public Boolean passed;

        public static CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult self = new CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult setBatchGuardCheckResult(String batchGuardCheckResult) {
            this.batchGuardCheckResult = batchGuardCheckResult;
            return this;
        }
        public String getBatchGuardCheckResult() {
            return this.batchGuardCheckResult;
        }

        public CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult setWarnContent(java.util.List<String> warnContent) {
            this.warnContent = warnContent;
            return this;
        }
        public java.util.List<String> getWarnContent() {
            return this.warnContent;
        }

        public CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult setContent(java.util.List<String> content) {
            this.content = content;
            return this;
        }
        public java.util.List<String> getContent() {
            return this.content;
        }

        public CheckLinkeBahamutIterationunitnextstagecheckResponseBodyResult setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

    }

}
