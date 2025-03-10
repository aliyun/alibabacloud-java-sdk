// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitTagMiningAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTagMiningAnalysisTaskResponseBody body;

    public static SubmitTagMiningAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTagMiningAnalysisTaskResponse self = new SubmitTagMiningAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTagMiningAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTagMiningAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTagMiningAnalysisTaskResponse setBody(SubmitTagMiningAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTagMiningAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
