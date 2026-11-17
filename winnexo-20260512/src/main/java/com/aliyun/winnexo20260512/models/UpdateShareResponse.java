// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateShareResponseBody body;

    public static UpdateShareResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateShareResponse self = new UpdateShareResponse();
        return TeaModel.build(map, self);
    }

    public UpdateShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateShareResponse setBody(UpdateShareResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateShareResponseBody getBody() {
        return this.body;
    }

}
