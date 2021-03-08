// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMultipartUploadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMultipartUploadResponseBody body;

    public static DeleteMultipartUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultipartUploadResponse self = new DeleteMultipartUploadResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultipartUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultipartUploadResponse setBody(DeleteMultipartUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultipartUploadResponseBody getBody() {
        return this.body;
    }

}
