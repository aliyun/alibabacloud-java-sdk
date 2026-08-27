// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopChatResponseBody body;

    public static StopChatResponse build(java.util.Map<String, ?> map) throws Exception {
        StopChatResponse self = new StopChatResponse();
        return TeaModel.build(map, self);
    }

    public StopChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopChatResponse setBody(StopChatResponseBody body) {
        this.body = body;
        return this;
    }
    public StopChatResponseBody getBody() {
        return this.body;
    }

}
