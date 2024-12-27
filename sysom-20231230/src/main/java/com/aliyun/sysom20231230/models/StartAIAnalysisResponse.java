// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAIAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAIAnalysisResponseBody body;

    public static StartAIAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAIAnalysisResponse self = new StartAIAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public StartAIAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAIAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAIAnalysisResponse setBody(StartAIAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAIAnalysisResponseBody getBody() {
        return this.body;
    }

}
