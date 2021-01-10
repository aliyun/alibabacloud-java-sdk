// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeBahamutStageuncompleteflowtasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public Long result;

    public static CountLinkeBahamutStageuncompleteflowtasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeBahamutStageuncompleteflowtasksResponseBody self = new CountLinkeBahamutStageuncompleteflowtasksResponseBody();
        return TeaModel.build(map, self);
    }

    public CountLinkeBahamutStageuncompleteflowtasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountLinkeBahamutStageuncompleteflowtasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CountLinkeBahamutStageuncompleteflowtasksResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CountLinkeBahamutStageuncompleteflowtasksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CountLinkeBahamutStageuncompleteflowtasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CountLinkeBahamutStageuncompleteflowtasksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountLinkeBahamutStageuncompleteflowtasksResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
