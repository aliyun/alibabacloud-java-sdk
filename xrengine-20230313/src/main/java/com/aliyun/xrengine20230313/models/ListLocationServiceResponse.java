// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class ListLocationServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLocationServiceResponseBody body;

    public static ListLocationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLocationServiceResponse self = new ListLocationServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListLocationServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLocationServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLocationServiceResponse setBody(ListLocationServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLocationServiceResponseBody getBody() {
        return this.body;
    }

}
