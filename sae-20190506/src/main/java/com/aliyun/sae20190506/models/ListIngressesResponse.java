// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListIngressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIngressesResponseBody body;

    public static ListIngressesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIngressesResponse self = new ListIngressesResponse();
        return TeaModel.build(map, self);
    }

    public ListIngressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIngressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIngressesResponse setBody(ListIngressesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIngressesResponseBody getBody() {
        return this.body;
    }

}
