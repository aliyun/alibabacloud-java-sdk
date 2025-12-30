// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIFileUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIFileUploadResponseBody body;

    public static ChatBIFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIFileUploadResponse self = new ChatBIFileUploadResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIFileUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIFileUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIFileUploadResponse setBody(ChatBIFileUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIFileUploadResponseBody getBody() {
        return this.body;
    }

}
