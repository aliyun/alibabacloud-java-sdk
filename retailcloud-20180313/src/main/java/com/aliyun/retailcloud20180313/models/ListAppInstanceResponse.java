// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppInstanceResponseBody body;

    public static ListAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceResponse self = new ListAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppInstanceResponse setBody(ListAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppInstanceResponseBody getBody() {
        return this.body;
    }

}
