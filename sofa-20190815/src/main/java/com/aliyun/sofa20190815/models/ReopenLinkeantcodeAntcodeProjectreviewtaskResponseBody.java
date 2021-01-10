// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResponseContent")
    public String responseContent;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    public static ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody self = new ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody setResponseContent(String responseContent) {
        this.responseContent = responseContent;
        return this;
    }
    public String getResponseContent() {
        return this.responseContent;
    }

    public ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

}
