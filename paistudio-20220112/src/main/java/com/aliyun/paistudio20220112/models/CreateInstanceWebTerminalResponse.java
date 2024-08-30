// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateInstanceWebTerminalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceWebTerminalResponseBody body;

    public static CreateInstanceWebTerminalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceWebTerminalResponse self = new CreateInstanceWebTerminalResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceWebTerminalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceWebTerminalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceWebTerminalResponse setBody(CreateInstanceWebTerminalResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceWebTerminalResponseBody getBody() {
        return this.body;
    }

}
