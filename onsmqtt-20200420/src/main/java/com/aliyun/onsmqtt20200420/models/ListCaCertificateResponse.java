// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCaCertificateResponseBody body;

    public static ListCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCaCertificateResponse self = new ListCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ListCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCaCertificateResponse setBody(ListCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCaCertificateResponseBody getBody() {
        return this.body;
    }

}
