// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class StopChatMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopChatMessageResponseBody body;

    public static StopChatMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        StopChatMessageResponse self = new StopChatMessageResponse();
        return TeaModel.build(map, self);
    }

    public StopChatMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopChatMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopChatMessageResponse setBody(StopChatMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public StopChatMessageResponseBody getBody() {
        return this.body;
    }

}
