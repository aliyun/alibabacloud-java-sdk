// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDependLibrarysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDependLibrarysResponseBody body;

    public static ListDependLibrarysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDependLibrarysResponse self = new ListDependLibrarysResponse();
        return TeaModel.build(map, self);
    }

    public ListDependLibrarysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDependLibrarysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDependLibrarysResponse setBody(ListDependLibrarysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDependLibrarysResponseBody getBody() {
        return this.body;
    }

}
