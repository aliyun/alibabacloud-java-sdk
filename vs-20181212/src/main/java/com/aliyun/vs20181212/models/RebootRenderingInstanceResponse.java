// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RebootRenderingInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootRenderingInstanceResponseBody body;

    public static RebootRenderingInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootRenderingInstanceResponse self = new RebootRenderingInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebootRenderingInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootRenderingInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootRenderingInstanceResponse setBody(RebootRenderingInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootRenderingInstanceResponseBody getBody() {
        return this.body;
    }

}
