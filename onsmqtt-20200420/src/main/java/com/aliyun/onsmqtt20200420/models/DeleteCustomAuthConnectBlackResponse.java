// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCustomAuthConnectBlackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomAuthConnectBlackResponseBody body;

    public static DeleteCustomAuthConnectBlackResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAuthConnectBlackResponse self = new DeleteCustomAuthConnectBlackResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAuthConnectBlackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomAuthConnectBlackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomAuthConnectBlackResponse setBody(DeleteCustomAuthConnectBlackResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomAuthConnectBlackResponseBody getBody() {
        return this.body;
    }

}
