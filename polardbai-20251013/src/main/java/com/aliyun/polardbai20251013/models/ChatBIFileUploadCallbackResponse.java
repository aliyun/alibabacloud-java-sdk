// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIFileUploadCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIFileUploadCallbackResponseBody body;

    public static ChatBIFileUploadCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIFileUploadCallbackResponse self = new ChatBIFileUploadCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIFileUploadCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIFileUploadCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIFileUploadCallbackResponse setBody(ChatBIFileUploadCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIFileUploadCallbackResponseBody getBody() {
        return this.body;
    }

}
