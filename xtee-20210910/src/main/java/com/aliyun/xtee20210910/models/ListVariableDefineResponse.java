// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ListVariableDefineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVariableDefineResponseBody body;

    public static ListVariableDefineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVariableDefineResponse self = new ListVariableDefineResponse();
        return TeaModel.build(map, self);
    }

    public ListVariableDefineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVariableDefineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVariableDefineResponse setBody(ListVariableDefineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVariableDefineResponseBody getBody() {
        return this.body;
    }

}
