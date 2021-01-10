// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinktAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadLinkeLinktAttachmentResponseBody body;

    public static UploadLinkeLinktAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinktAttachmentResponse self = new UploadLinkeLinktAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinktAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadLinkeLinktAttachmentResponse setBody(UploadLinkeLinktAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadLinkeLinktAttachmentResponseBody getBody() {
        return this.body;
    }

}
