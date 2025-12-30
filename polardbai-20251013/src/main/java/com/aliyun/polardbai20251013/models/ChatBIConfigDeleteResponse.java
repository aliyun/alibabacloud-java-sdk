// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIConfigDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIConfigDeleteResponseBody body;

    public static ChatBIConfigDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIConfigDeleteResponse self = new ChatBIConfigDeleteResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIConfigDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIConfigDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIConfigDeleteResponse setBody(ChatBIConfigDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIConfigDeleteResponseBody getBody() {
        return this.body;
    }

}
