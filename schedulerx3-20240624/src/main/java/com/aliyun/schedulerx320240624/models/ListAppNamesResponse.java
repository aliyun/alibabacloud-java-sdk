// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListAppNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppNamesResponseBody body;

    public static ListAppNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppNamesResponse self = new ListAppNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppNamesResponse setBody(ListAppNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppNamesResponseBody getBody() {
        return this.body;
    }

}
