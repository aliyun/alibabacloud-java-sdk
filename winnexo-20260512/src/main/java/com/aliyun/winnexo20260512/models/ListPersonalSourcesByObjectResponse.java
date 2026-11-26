// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListPersonalSourcesByObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPersonalSourcesByObjectResponseBody body;

    public static ListPersonalSourcesByObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonalSourcesByObjectResponse self = new ListPersonalSourcesByObjectResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonalSourcesByObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersonalSourcesByObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPersonalSourcesByObjectResponse setBody(ListPersonalSourcesByObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersonalSourcesByObjectResponseBody getBody() {
        return this.body;
    }

}
