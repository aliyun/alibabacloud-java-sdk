// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserExecutionsResponseBody body;

    public static ListUserExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserExecutionsResponse self = new ListUserExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserExecutionsResponse setBody(ListUserExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserExecutionsResponseBody getBody() {
        return this.body;
    }

}
