// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiSignaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDpiSignaturesResponseBody body;

    public static ListDpiSignaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDpiSignaturesResponse self = new ListDpiSignaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListDpiSignaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDpiSignaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDpiSignaturesResponse setBody(ListDpiSignaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDpiSignaturesResponseBody getBody() {
        return this.body;
    }

}
