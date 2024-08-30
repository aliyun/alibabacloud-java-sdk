// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CheckInstanceWebTerminalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckInstanceWebTerminalResponseBody body;

    public static CheckInstanceWebTerminalResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceWebTerminalResponse self = new CheckInstanceWebTerminalResponse();
        return TeaModel.build(map, self);
    }

    public CheckInstanceWebTerminalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInstanceWebTerminalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckInstanceWebTerminalResponse setBody(CheckInstanceWebTerminalResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInstanceWebTerminalResponseBody getBody() {
        return this.body;
    }

}
