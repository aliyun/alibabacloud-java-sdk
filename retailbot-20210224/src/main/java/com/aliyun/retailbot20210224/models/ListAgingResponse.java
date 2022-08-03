// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListAgingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAgingResponseBody body;

    public static ListAgingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgingResponse self = new ListAgingResponse();
        return TeaModel.build(map, self);
    }

    public ListAgingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgingResponse setBody(ListAgingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgingResponseBody getBody() {
        return this.body;
    }

}
