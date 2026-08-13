// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class StreamChatMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StreamChatMessageResponseBody body;

    public static StreamChatMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        StreamChatMessageResponse self = new StreamChatMessageResponse();
        return TeaModel.build(map, self);
    }

    public StreamChatMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StreamChatMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StreamChatMessageResponse setBody(StreamChatMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public StreamChatMessageResponseBody getBody() {
        return this.body;
    }

}
