// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExperimentsResponseBody body;

    public static ListExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentsResponse self = new ListExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentsResponse setBody(ListExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentsResponseBody getBody() {
        return this.body;
    }

}
