// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class PrepareUploadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PrepareUploadResponseBody body;

    public static PrepareUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        PrepareUploadResponse self = new PrepareUploadResponse();
        return TeaModel.build(map, self);
    }

    public PrepareUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrepareUploadResponse setBody(PrepareUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public PrepareUploadResponseBody getBody() {
        return this.body;
    }

}
