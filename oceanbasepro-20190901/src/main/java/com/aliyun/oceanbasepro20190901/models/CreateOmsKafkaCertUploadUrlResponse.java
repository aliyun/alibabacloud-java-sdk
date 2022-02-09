// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsKafkaCertUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOmsKafkaCertUploadUrlResponseBody body;

    public static CreateOmsKafkaCertUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsKafkaCertUploadUrlResponse self = new CreateOmsKafkaCertUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateOmsKafkaCertUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOmsKafkaCertUploadUrlResponse setBody(CreateOmsKafkaCertUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOmsKafkaCertUploadUrlResponseBody getBody() {
        return this.body;
    }

}
