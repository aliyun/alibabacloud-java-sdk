// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadFileCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadFileCheckResponseBody body;

    public static UploadFileCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFileCheckResponse self = new UploadFileCheckResponse();
        return TeaModel.build(map, self);
    }

    public UploadFileCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadFileCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadFileCheckResponse setBody(UploadFileCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadFileCheckResponseBody getBody() {
        return this.body;
    }

}
