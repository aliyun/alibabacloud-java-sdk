// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeLsifexistsResponseBody extends TeaModel {
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

    public static QueryLinkeantcodeAntcodeLsifexistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeLsifexistsResponseBody self = new QueryLinkeantcodeAntcodeLsifexistsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeLsifexistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeLsifexistsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeLsifexistsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeLsifexistsResponseBody setResponseContent(String responseContent) {
        this.responseContent = responseContent;
        return this;
    }
    public String getResponseContent() {
        return this.responseContent;
    }

    public QueryLinkeantcodeAntcodeLsifexistsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

}
