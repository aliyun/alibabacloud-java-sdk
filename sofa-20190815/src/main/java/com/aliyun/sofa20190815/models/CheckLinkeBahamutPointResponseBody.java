// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutPointResponseBody extends TeaModel {
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
    public CheckLinkeBahamutPointResponseBodyResult result;

    public static CheckLinkeBahamutPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutPointResponseBody self = new CheckLinkeBahamutPointResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutPointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutPointResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeBahamutPointResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CheckLinkeBahamutPointResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutPointResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutPointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutPointResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutPointResponseBody setResult(CheckLinkeBahamutPointResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckLinkeBahamutPointResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutPointResponseBodyResult extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("Message")
        public String message;

        @NameInMap("Mandatory")
        public Boolean mandatory;

        @NameInMap("DetailUrl")
        public String detailUrl;

        public static CheckLinkeBahamutPointResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutPointResponseBodyResult self = new CheckLinkeBahamutPointResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutPointResponseBodyResult setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public CheckLinkeBahamutPointResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CheckLinkeBahamutPointResponseBodyResult setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public CheckLinkeBahamutPointResponseBodyResult setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

    }

}
