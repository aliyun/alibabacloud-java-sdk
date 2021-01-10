// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkeBahamutIterationconfigcheckResponseBody extends TeaModel {
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
    public ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult result;

    public static ConfirmLinkeBahamutIterationconfigcheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkeBahamutIterationconfigcheckResponseBody self = new ConfirmLinkeBahamutIterationconfigcheckResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmLinkeBahamutIterationconfigcheckResponseBody setResult(ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult getResult() {
        return this.result;
    }

    public static class ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("ForceStop")
        public Boolean forceStop;

        @NameInMap("CheckList")
        public java.util.List<String> checkList;

        @NameInMap("DetailMessage")
        public String detailMessage;

        public static ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult self = new ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult setForceStop(Boolean forceStop) {
            this.forceStop = forceStop;
            return this;
        }
        public Boolean getForceStop() {
            return this.forceStop;
        }

        public ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult setCheckList(java.util.List<String> checkList) {
            this.checkList = checkList;
            return this;
        }
        public java.util.List<String> getCheckList() {
            return this.checkList;
        }

        public ConfirmLinkeBahamutIterationconfigcheckResponseBodyResult setDetailMessage(String detailMessage) {
            this.detailMessage = detailMessage;
            return this;
        }
        public String getDetailMessage() {
            return this.detailMessage;
        }

    }

}
