// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPersonsResponseBody body;

    public static ListPersonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonsResponse self = new ListPersonsResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPersonsResponse setBody(ListPersonsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersonsResponseBody getBody() {
        return this.body;
    }

}
