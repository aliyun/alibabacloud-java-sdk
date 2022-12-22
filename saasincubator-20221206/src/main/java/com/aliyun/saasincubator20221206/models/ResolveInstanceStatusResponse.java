// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saasincubator20221206.models;

import com.aliyun.tea.*;

public class ResolveInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResolveInstanceStatusResponseBody body;

    public static ResolveInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ResolveInstanceStatusResponse self = new ResolveInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public ResolveInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResolveInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResolveInstanceStatusResponse setBody(ResolveInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ResolveInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
