// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListActionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListActionsResponseBody body;

    public static ListActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActionsResponse self = new ListActionsResponse();
        return TeaModel.build(map, self);
    }

    public ListActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActionsResponse setBody(ListActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActionsResponseBody getBody() {
        return this.body;
    }

}
