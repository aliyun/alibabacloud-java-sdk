// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternIndexDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPatternIndexDeleteResponseBody body;

    public static ChatBIPatternIndexDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternIndexDeleteResponse self = new ChatBIPatternIndexDeleteResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternIndexDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPatternIndexDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPatternIndexDeleteResponse setBody(ChatBIPatternIndexDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPatternIndexDeleteResponseBody getBody() {
        return this.body;
    }

}
