// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingsolutionframework20230810.models;

import com.aliyun.tea.*;

public class SendOpsMessageToTerminalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendOpsMessageToTerminalResponseBody body;

    public static SendOpsMessageToTerminalResponse build(java.util.Map<String, ?> map) throws Exception {
        SendOpsMessageToTerminalResponse self = new SendOpsMessageToTerminalResponse();
        return TeaModel.build(map, self);
    }

    public SendOpsMessageToTerminalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendOpsMessageToTerminalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendOpsMessageToTerminalResponse setBody(SendOpsMessageToTerminalResponseBody body) {
        this.body = body;
        return this;
    }
    public SendOpsMessageToTerminalResponseBody getBody() {
        return this.body;
    }

}
