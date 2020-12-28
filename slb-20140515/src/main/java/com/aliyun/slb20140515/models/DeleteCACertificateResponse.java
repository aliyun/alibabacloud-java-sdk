// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCACertificateResponseBody body;

    public static DeleteCACertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCACertificateResponse self = new DeleteCACertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCACertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCACertificateResponse setBody(DeleteCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCACertificateResponseBody getBody() {
        return this.body;
    }

}
