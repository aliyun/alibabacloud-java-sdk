// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CreateDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDownloadUrlResponseBody body;

    public static CreateDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadUrlResponse self = new CreateDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDownloadUrlResponse setBody(CreateDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
