// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UploadInstanceKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadInstanceKeyPairResponseBody body;

    public static UploadInstanceKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadInstanceKeyPairResponse self = new UploadInstanceKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public UploadInstanceKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadInstanceKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadInstanceKeyPairResponse setBody(UploadInstanceKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadInstanceKeyPairResponseBody getBody() {
        return this.body;
    }

}
