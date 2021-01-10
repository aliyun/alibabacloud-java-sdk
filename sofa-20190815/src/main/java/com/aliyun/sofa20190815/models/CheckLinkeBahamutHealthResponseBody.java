// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutHealthResponseBody extends TeaModel {
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
    public CheckLinkeBahamutHealthResponseBodyResult result;

    public static CheckLinkeBahamutHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutHealthResponseBody self = new CheckLinkeBahamutHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutHealthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutHealthResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeBahamutHealthResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CheckLinkeBahamutHealthResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutHealthResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutHealthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutHealthResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutHealthResponseBody setResult(CheckLinkeBahamutHealthResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckLinkeBahamutHealthResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutHealthResponseBodyResult extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("Message")
        public String message;

        @NameInMap("Mandatory")
        public Boolean mandatory;

        @NameInMap("DetailUrl")
        public String detailUrl;

        public static CheckLinkeBahamutHealthResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutHealthResponseBodyResult self = new CheckLinkeBahamutHealthResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutHealthResponseBodyResult setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public CheckLinkeBahamutHealthResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CheckLinkeBahamutHealthResponseBodyResult setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public CheckLinkeBahamutHealthResponseBodyResult setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

    }

}
