// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoRenderJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoRenderJobResponseBody body;

    public static GetVideoRenderJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoRenderJobResponse self = new GetVideoRenderJobResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoRenderJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoRenderJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoRenderJobResponse setBody(GetVideoRenderJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoRenderJobResponseBody getBody() {
        return this.body;
    }

}
