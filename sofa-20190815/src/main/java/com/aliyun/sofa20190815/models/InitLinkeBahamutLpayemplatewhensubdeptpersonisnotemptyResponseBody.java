// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody extends TeaModel {
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

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    public static InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody self = new InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
