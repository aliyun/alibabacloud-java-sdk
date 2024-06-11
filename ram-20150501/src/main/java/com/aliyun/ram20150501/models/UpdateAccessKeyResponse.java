// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateAccessKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAccessKeyResponseBody body;

    public static UpdateAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessKeyResponse self = new UpdateAccessKeyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccessKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccessKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccessKeyResponse setBody(UpdateAccessKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccessKeyResponseBody getBody() {
        return this.body;
    }

}
