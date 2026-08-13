// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UploadChatFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadChatFileResponseBody body;

    public static UploadChatFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadChatFileResponse self = new UploadChatFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadChatFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadChatFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadChatFileResponse setBody(UploadChatFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadChatFileResponseBody getBody() {
        return this.body;
    }

}
