// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class StopHpoTrialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopHpoTrialsResponseBody body;

    public static StopHpoTrialsResponse build(java.util.Map<String, ?> map) throws Exception {
        StopHpoTrialsResponse self = new StopHpoTrialsResponse();
        return TeaModel.build(map, self);
    }

    public StopHpoTrialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopHpoTrialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopHpoTrialsResponse setBody(StopHpoTrialsResponseBody body) {
        this.body = body;
        return this;
    }
    public StopHpoTrialsResponseBody getBody() {
        return this.body;
    }

}
