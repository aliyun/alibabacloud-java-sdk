// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVariablesResponseBody body;

    public static ListVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVariablesResponse self = new ListVariablesResponse();
        return TeaModel.build(map, self);
    }

    public ListVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVariablesResponse setBody(ListVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVariablesResponseBody getBody() {
        return this.body;
    }

}
