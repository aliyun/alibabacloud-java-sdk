// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RefreshRenderingInstanceStreamingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshRenderingInstanceStreamingResponseBody body;

    public static RefreshRenderingInstanceStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshRenderingInstanceStreamingResponse self = new RefreshRenderingInstanceStreamingResponse();
        return TeaModel.build(map, self);
    }

    public RefreshRenderingInstanceStreamingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshRenderingInstanceStreamingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshRenderingInstanceStreamingResponse setBody(RefreshRenderingInstanceStreamingResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshRenderingInstanceStreamingResponseBody getBody() {
        return this.body;
    }

}
