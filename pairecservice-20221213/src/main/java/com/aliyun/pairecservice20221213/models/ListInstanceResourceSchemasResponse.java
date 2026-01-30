// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourceSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceResourceSchemasResponseBody body;

    public static ListInstanceResourceSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResourceSchemasResponse self = new ListInstanceResourceSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceResourceSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceResourceSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceResourceSchemasResponse setBody(ListInstanceResourceSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceResourceSchemasResponseBody getBody() {
        return this.body;
    }

}
