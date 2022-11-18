// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RevokeSagInstanceFromCcnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeSagInstanceFromCcnResponseBody body;

    public static RevokeSagInstanceFromCcnResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeSagInstanceFromCcnResponse self = new RevokeSagInstanceFromCcnResponse();
        return TeaModel.build(map, self);
    }

    public RevokeSagInstanceFromCcnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeSagInstanceFromCcnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeSagInstanceFromCcnResponse setBody(RevokeSagInstanceFromCcnResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeSagInstanceFromCcnResponseBody getBody() {
        return this.body;
    }

}
