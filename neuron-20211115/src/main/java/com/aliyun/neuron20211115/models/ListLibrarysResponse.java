// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListLibrarysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLibrarysResponseBody body;

    public static ListLibrarysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLibrarysResponse self = new ListLibrarysResponse();
        return TeaModel.build(map, self);
    }

    public ListLibrarysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLibrarysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLibrarysResponse setBody(ListLibrarysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLibrarysResponseBody getBody() {
        return this.body;
    }

}
