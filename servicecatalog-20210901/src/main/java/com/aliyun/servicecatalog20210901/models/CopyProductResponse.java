// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CopyProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CopyProductResponseBody body;

    public static CopyProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyProductResponse self = new CopyProductResponse();
        return TeaModel.build(map, self);
    }

    public CopyProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyProductResponse setBody(CopyProductResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyProductResponseBody getBody() {
        return this.body;
    }

}
