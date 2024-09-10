// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAttestorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAttestorResponseBody body;

    public static DeleteAttestorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttestorResponse self = new DeleteAttestorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAttestorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAttestorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAttestorResponse setBody(DeleteAttestorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAttestorResponseBody getBody() {
        return this.body;
    }

}
