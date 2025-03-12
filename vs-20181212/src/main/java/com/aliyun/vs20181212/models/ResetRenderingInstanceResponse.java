// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ResetRenderingInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetRenderingInstanceResponseBody body;

    public static ResetRenderingInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetRenderingInstanceResponse self = new ResetRenderingInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResetRenderingInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetRenderingInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetRenderingInstanceResponse setBody(ResetRenderingInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetRenderingInstanceResponseBody getBody() {
        return this.body;
    }

}
