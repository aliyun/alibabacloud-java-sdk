// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonTraceDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPersonTraceDetailsResponseBody body;

    public static ListPersonTraceDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTraceDetailsResponse self = new ListPersonTraceDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonTraceDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersonTraceDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPersonTraceDetailsResponse setBody(ListPersonTraceDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersonTraceDetailsResponseBody getBody() {
        return this.body;
    }

}
