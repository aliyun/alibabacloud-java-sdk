// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetVideoAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoAnalysisTaskResponseBody body;

    public static GetVideoAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAnalysisTaskResponse self = new GetVideoAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoAnalysisTaskResponse setBody(GetVideoAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
