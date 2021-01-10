// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeSearchmonitorResponseBody extends TeaModel {
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

    public static CreateLinkeantcodeAntcodeSearchmonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeSearchmonitorResponseBody self = new CreateLinkeantcodeAntcodeSearchmonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeSearchmonitorResponseBody setResponseContent(String responseContent) {
        this.responseContent = responseContent;
        return this;
    }
    public String getResponseContent() {
        return this.responseContent;
    }

    public CreateLinkeantcodeAntcodeSearchmonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeSearchmonitorResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeSearchmonitorResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeSearchmonitorResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
