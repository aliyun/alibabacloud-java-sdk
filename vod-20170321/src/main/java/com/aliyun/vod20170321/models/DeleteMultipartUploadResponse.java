// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMultipartUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteMultipartUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultipartUploadResponse setBody(DeleteMultipartUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultipartUploadResponseBody getBody() {
        return this.body;
    }

}
