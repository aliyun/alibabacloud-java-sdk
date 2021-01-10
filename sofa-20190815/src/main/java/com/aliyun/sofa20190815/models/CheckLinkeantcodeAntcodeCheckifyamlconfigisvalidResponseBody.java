// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UnSupportPluginError")
    public String unSupportPluginError;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("SyntaxError")
    public Boolean syntaxError;

    @NameInMap("SyntaxErrorInfo")
    public String syntaxErrorInfo;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Solution")
    public String solution;

    public static CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody self = new CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody setUnSupportPluginError(String unSupportPluginError) {
        this.unSupportPluginError = unSupportPluginError;
        return this;
    }
    public String getUnSupportPluginError() {
        return this.unSupportPluginError;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody setSyntaxError(Boolean syntaxError) {
        this.syntaxError = syntaxError;
        return this;
    }
    public Boolean getSyntaxError() {
        return this.syntaxError;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody setSyntaxErrorInfo(String syntaxErrorInfo) {
        this.syntaxErrorInfo = syntaxErrorInfo;
        return this;
    }
    public String getSyntaxErrorInfo() {
        return this.syntaxErrorInfo;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseBody setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

}
