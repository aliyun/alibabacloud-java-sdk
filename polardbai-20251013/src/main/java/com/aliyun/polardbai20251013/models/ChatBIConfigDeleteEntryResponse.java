// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIConfigDeleteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIConfigDeleteEntryResponseBody body;

    public static ChatBIConfigDeleteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIConfigDeleteEntryResponse self = new ChatBIConfigDeleteEntryResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIConfigDeleteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIConfigDeleteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIConfigDeleteEntryResponse setBody(ChatBIConfigDeleteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIConfigDeleteEntryResponseBody getBody() {
        return this.body;
    }

}
