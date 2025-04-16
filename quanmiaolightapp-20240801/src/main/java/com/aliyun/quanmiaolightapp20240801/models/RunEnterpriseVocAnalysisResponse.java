// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunEnterpriseVocAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunEnterpriseVocAnalysisResponseBody body;

    public static RunEnterpriseVocAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunEnterpriseVocAnalysisResponse self = new RunEnterpriseVocAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public RunEnterpriseVocAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunEnterpriseVocAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunEnterpriseVocAnalysisResponse setBody(RunEnterpriseVocAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public RunEnterpriseVocAnalysisResponseBody getBody() {
        return this.body;
    }

}
