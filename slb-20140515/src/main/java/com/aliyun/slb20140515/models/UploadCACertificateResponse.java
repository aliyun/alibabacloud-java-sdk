// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadCACertificateResponseBody body;

    public static UploadCACertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCACertificateResponse self = new UploadCACertificateResponse();
        return TeaModel.build(map, self);
    }

    public UploadCACertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCACertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadCACertificateResponse setBody(UploadCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCACertificateResponseBody getBody() {
        return this.body;
    }

}
