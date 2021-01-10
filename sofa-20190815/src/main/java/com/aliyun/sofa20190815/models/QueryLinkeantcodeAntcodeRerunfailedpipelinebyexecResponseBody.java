// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Status")
    public Boolean status;

    public static QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody self = new QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
