// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAttestorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAttestorResponseBody body;

    public static ModifyAttestorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAttestorResponse self = new ModifyAttestorResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAttestorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAttestorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAttestorResponse setBody(ModifyAttestorResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAttestorResponseBody getBody() {
        return this.body;
    }

}
