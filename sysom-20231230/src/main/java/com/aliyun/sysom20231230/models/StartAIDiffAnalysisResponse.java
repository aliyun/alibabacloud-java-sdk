// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAIDiffAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAIDiffAnalysisResponseBody body;

    public static StartAIDiffAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAIDiffAnalysisResponse self = new StartAIDiffAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public StartAIDiffAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAIDiffAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAIDiffAnalysisResponse setBody(StartAIDiffAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAIDiffAnalysisResponseBody getBody() {
        return this.body;
    }

}
