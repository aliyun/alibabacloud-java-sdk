// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CreateDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
