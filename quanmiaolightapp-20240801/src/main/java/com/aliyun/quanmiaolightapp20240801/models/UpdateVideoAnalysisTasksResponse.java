// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoAnalysisTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVideoAnalysisTasksResponseBody body;

    public static UpdateVideoAnalysisTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoAnalysisTasksResponse self = new UpdateVideoAnalysisTasksResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoAnalysisTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoAnalysisTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVideoAnalysisTasksResponse setBody(UpdateVideoAnalysisTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoAnalysisTasksResponseBody getBody() {
        return this.body;
    }

}
