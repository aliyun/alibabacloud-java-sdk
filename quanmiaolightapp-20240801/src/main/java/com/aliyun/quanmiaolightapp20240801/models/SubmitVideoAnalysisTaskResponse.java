// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitVideoAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoAnalysisTaskResponseBody body;

    public static SubmitVideoAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoAnalysisTaskResponse self = new SubmitVideoAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoAnalysisTaskResponse setBody(SubmitVideoAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
