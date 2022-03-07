// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class UpdateUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUploadUrlResponseBody body;

    public static UpdateUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUploadUrlResponse self = new UpdateUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUploadUrlResponse setBody(UpdateUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUploadUrlResponseBody getBody() {
        return this.body;
    }

}
