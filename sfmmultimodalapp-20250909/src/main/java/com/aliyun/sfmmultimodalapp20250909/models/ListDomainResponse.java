// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDomainResponseBody body;

    public static ListDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainResponse self = new ListDomainResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDomainResponse setBody(ListDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainResponseBody getBody() {
        return this.body;
    }

}
