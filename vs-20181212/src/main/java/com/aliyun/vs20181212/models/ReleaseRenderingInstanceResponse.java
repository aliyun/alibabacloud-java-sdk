// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ReleaseRenderingInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseRenderingInstanceResponseBody body;

    public static ReleaseRenderingInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseRenderingInstanceResponse self = new ReleaseRenderingInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseRenderingInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseRenderingInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseRenderingInstanceResponse setBody(ReleaseRenderingInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseRenderingInstanceResponseBody getBody() {
        return this.body;
    }

}
