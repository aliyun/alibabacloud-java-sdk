// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIConfigCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIConfigCreateResponseBody body;

    public static ChatBIConfigCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIConfigCreateResponse self = new ChatBIConfigCreateResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIConfigCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIConfigCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIConfigCreateResponse setBody(ChatBIConfigCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIConfigCreateResponseBody getBody() {
        return this.body;
    }

}
