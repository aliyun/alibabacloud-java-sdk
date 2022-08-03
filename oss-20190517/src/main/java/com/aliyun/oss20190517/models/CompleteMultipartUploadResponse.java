// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CompleteMultipartUploadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteMultipartUploadResponseBody body;

    public static CompleteMultipartUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteMultipartUploadResponse self = new CompleteMultipartUploadResponse();
        return TeaModel.build(map, self);
    }

    public CompleteMultipartUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteMultipartUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteMultipartUploadResponse setBody(CompleteMultipartUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteMultipartUploadResponseBody getBody() {
        return this.body;
    }

}
