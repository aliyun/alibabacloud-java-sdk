// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeantcodeAntcodeLsifexistsResponseBody extends TeaModel {
    @NameInMap("ResponseContent")
    public String responseContent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CheckLinkeantcodeAntcodeLsifexistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeantcodeAntcodeLsifexistsResponseBody self = new CheckLinkeantcodeAntcodeLsifexistsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeantcodeAntcodeLsifexistsResponseBody setResponseContent(String responseContent) {
        this.responseContent = responseContent;
        return this;
    }
    public String getResponseContent() {
        return this.responseContent;
    }

    public CheckLinkeantcodeAntcodeLsifexistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeantcodeAntcodeLsifexistsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeantcodeAntcodeLsifexistsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeantcodeAntcodeLsifexistsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
