// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class SubmitAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAnalysisTaskResponseBody body;

    public static SubmitAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnalysisTaskResponse self = new SubmitAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAnalysisTaskResponse setBody(SubmitAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
