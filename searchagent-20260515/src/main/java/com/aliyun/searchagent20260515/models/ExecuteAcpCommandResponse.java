// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchagent20260515.models;

import com.aliyun.tea.*;

public class ExecuteAcpCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAcpCommandResponseBody body;

    public static ExecuteAcpCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAcpCommandResponse self = new ExecuteAcpCommandResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAcpCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAcpCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAcpCommandResponse setBody(ExecuteAcpCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAcpCommandResponseBody getBody() {
        return this.body;
    }

}
