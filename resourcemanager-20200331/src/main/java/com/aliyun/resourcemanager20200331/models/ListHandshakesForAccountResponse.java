// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListHandshakesForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHandshakesForAccountResponseBody body;

    public static ListHandshakesForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHandshakesForAccountResponse self = new ListHandshakesForAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListHandshakesForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHandshakesForAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHandshakesForAccountResponse setBody(ListHandshakesForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHandshakesForAccountResponseBody getBody() {
        return this.body;
    }

}
