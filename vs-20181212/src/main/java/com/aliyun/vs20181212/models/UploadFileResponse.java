// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadFileResponseBody body;

    public static UploadFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFileResponse self = new UploadFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadFileResponse setBody(UploadFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadFileResponseBody getBody() {
        return this.body;
    }

}
