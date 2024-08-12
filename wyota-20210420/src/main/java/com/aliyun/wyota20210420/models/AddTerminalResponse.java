// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddTerminalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTerminalResponseBody body;

    public static AddTerminalResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTerminalResponse self = new AddTerminalResponse();
        return TeaModel.build(map, self);
    }

    public AddTerminalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTerminalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTerminalResponse setBody(AddTerminalResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTerminalResponseBody getBody() {
        return this.body;
    }

}
