// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIConfigQueryEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIConfigQueryEntriesResponseBody body;

    public static ChatBIConfigQueryEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIConfigQueryEntriesResponse self = new ChatBIConfigQueryEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIConfigQueryEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIConfigQueryEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIConfigQueryEntriesResponse setBody(ChatBIConfigQueryEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIConfigQueryEntriesResponseBody getBody() {
        return this.body;
    }

}
