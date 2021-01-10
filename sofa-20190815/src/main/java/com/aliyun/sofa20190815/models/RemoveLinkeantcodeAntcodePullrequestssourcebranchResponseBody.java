// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("TagName")
    public String tagName;

    public static RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody self = new RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
