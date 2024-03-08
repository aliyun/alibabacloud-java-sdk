// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class RestartHpoTrialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartHpoTrialsResponseBody body;

    public static RestartHpoTrialsResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartHpoTrialsResponse self = new RestartHpoTrialsResponse();
        return TeaModel.build(map, self);
    }

    public RestartHpoTrialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartHpoTrialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartHpoTrialsResponse setBody(RestartHpoTrialsResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartHpoTrialsResponseBody getBody() {
        return this.body;
    }

}
