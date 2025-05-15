// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVideoAnalysisTaskResponseBody body;

    public static UpdateVideoAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoAnalysisTaskResponse self = new UpdateVideoAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVideoAnalysisTaskResponse setBody(UpdateVideoAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
