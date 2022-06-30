// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCorpsResponseBody body;

    public static ListCorpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorpsResponse self = new ListCorpsResponse();
        return TeaModel.build(map, self);
    }

    public ListCorpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCorpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCorpsResponse setBody(ListCorpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCorpsResponseBody getBody() {
        return this.body;
    }

}
