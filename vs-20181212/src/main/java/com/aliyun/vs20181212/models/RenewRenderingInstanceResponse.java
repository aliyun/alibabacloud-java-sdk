// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RenewRenderingInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewRenderingInstanceResponseBody body;

    public static RenewRenderingInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewRenderingInstanceResponse self = new RenewRenderingInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewRenderingInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewRenderingInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewRenderingInstanceResponse setBody(RenewRenderingInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewRenderingInstanceResponseBody getBody() {
        return this.body;
    }

}
