// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class SendOpsMessageToTerminalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendOpsMessageToTerminalsResponseBody body;

    public static SendOpsMessageToTerminalsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendOpsMessageToTerminalsResponse self = new SendOpsMessageToTerminalsResponse();
        return TeaModel.build(map, self);
    }

    public SendOpsMessageToTerminalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendOpsMessageToTerminalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendOpsMessageToTerminalsResponse setBody(SendOpsMessageToTerminalsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendOpsMessageToTerminalsResponseBody getBody() {
        return this.body;
    }

}
