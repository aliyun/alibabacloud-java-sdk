// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListLogosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLogosResponseBody body;

    public static ListLogosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogosResponse self = new ListLogosResponse();
        return TeaModel.build(map, self);
    }

    public ListLogosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogosResponse setBody(ListLogosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogosResponseBody getBody() {
        return this.body;
    }

}
