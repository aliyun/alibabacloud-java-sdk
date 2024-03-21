// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SendMessageToUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendMessageToUserResponseBody body;

    public static SendMessageToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToUserResponse self = new SendMessageToUserResponse();
        return TeaModel.build(map, self);
    }

    public SendMessageToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMessageToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendMessageToUserResponse setBody(SendMessageToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMessageToUserResponseBody getBody() {
        return this.body;
    }

}
