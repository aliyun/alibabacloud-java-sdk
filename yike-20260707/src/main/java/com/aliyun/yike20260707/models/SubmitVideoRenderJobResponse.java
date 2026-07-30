// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoRenderJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoRenderJobResponseBody body;

    public static SubmitVideoRenderJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoRenderJobResponse self = new SubmitVideoRenderJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoRenderJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoRenderJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoRenderJobResponse setBody(SubmitVideoRenderJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoRenderJobResponseBody getBody() {
        return this.body;
    }

}
