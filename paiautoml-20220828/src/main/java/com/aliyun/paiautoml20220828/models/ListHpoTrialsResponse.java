// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoTrialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHpoTrialsResponseBody body;

    public static ListHpoTrialsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHpoTrialsResponse self = new ListHpoTrialsResponse();
        return TeaModel.build(map, self);
    }

    public ListHpoTrialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHpoTrialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHpoTrialsResponse setBody(ListHpoTrialsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHpoTrialsResponseBody getBody() {
        return this.body;
    }

}
