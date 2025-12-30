// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIFileTemplateDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIFileTemplateDownloadResponseBody body;

    public static ChatBIFileTemplateDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIFileTemplateDownloadResponse self = new ChatBIFileTemplateDownloadResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIFileTemplateDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIFileTemplateDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIFileTemplateDownloadResponse setBody(ChatBIFileTemplateDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIFileTemplateDownloadResponseBody getBody() {
        return this.body;
    }

}
