// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class AddCustomAuthConnectBlackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCustomAuthConnectBlackResponseBody body;

    public static AddCustomAuthConnectBlackResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAuthConnectBlackResponse self = new AddCustomAuthConnectBlackResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomAuthConnectBlackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomAuthConnectBlackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomAuthConnectBlackResponse setBody(AddCustomAuthConnectBlackResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomAuthConnectBlackResponseBody getBody() {
        return this.body;
    }

}
