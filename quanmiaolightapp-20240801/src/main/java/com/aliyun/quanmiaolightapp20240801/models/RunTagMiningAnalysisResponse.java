// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunTagMiningAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunTagMiningAnalysisResponseBody body;

    public static RunTagMiningAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunTagMiningAnalysisResponse self = new RunTagMiningAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public RunTagMiningAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunTagMiningAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunTagMiningAnalysisResponse setBody(RunTagMiningAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public RunTagMiningAnalysisResponseBody getBody() {
        return this.body;
    }

}
