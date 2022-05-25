// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PackSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PackSourceResponseBody body;

    public static PackSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PackSourceResponse self = new PackSourceResponse();
        return TeaModel.build(map, self);
    }

    public PackSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PackSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PackSourceResponse setBody(PackSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public PackSourceResponseBody getBody() {
        return this.body;
    }

}
