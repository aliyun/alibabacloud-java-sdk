// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("LogUrl")
    public String logUrl;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Timestamp")
    public Long timestamp;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public String result;

    public static CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody self = new CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody();
        return TeaModel.build(map, self);
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }
    public String getLogUrl() {
        return this.logUrl;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
