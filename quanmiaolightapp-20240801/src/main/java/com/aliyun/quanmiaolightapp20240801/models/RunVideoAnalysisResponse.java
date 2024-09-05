// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunVideoAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunVideoAnalysisResponseBody body;

    public static RunVideoAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunVideoAnalysisResponse self = new RunVideoAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public RunVideoAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunVideoAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunVideoAnalysisResponse setBody(RunVideoAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public RunVideoAnalysisResponseBody getBody() {
        return this.body;
    }

}
