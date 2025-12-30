// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIUpdateTableValidationColumnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIUpdateTableValidationColumnsResponseBody body;

    public static ChatBIUpdateTableValidationColumnsResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIUpdateTableValidationColumnsResponse self = new ChatBIUpdateTableValidationColumnsResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIUpdateTableValidationColumnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIUpdateTableValidationColumnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIUpdateTableValidationColumnsResponse setBody(ChatBIUpdateTableValidationColumnsResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIUpdateTableValidationColumnsResponseBody getBody() {
        return this.body;
    }

}
