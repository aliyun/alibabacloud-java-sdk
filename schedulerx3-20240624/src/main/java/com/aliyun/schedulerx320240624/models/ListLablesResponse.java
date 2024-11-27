// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListLablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLablesResponseBody body;

    public static ListLablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLablesResponse self = new ListLablesResponse();
        return TeaModel.build(map, self);
    }

    public ListLablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLablesResponse setBody(ListLablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLablesResponseBody getBody() {
        return this.body;
    }

}
