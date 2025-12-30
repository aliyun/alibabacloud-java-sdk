// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIConfigUpdateEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIConfigUpdateEntryResponseBody body;

    public static ChatBIConfigUpdateEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIConfigUpdateEntryResponse self = new ChatBIConfigUpdateEntryResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIConfigUpdateEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIConfigUpdateEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIConfigUpdateEntryResponse setBody(ChatBIConfigUpdateEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIConfigUpdateEntryResponseBody getBody() {
        return this.body;
    }

}
