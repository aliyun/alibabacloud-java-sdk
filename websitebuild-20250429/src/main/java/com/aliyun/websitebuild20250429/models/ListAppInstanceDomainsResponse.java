// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppInstanceDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppInstanceDomainsResponseBody body;

    public static ListAppInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceDomainsResponse self = new ListAppInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppInstanceDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppInstanceDomainsResponse setBody(ListAppInstanceDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppInstanceDomainsResponseBody getBody() {
        return this.body;
    }

}
