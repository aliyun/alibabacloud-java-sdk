// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAifgAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAifgAnalysisResponseBody body;

    public static StartAifgAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAifgAnalysisResponse self = new StartAifgAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public StartAifgAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAifgAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAifgAnalysisResponse setBody(StartAifgAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAifgAnalysisResponseBody getBody() {
        return this.body;
    }

}
