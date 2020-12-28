// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadServerCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadServerCertificateResponseBody body;

    public static UploadServerCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadServerCertificateResponse self = new UploadServerCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UploadServerCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadServerCertificateResponse setBody(UploadServerCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadServerCertificateResponseBody getBody() {
        return this.body;
    }

}
