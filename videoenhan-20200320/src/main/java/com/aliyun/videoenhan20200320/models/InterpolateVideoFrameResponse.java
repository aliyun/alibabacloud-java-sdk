// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class InterpolateVideoFrameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InterpolateVideoFrameResponseBody body;

    public static InterpolateVideoFrameResponse build(java.util.Map<String, ?> map) throws Exception {
        InterpolateVideoFrameResponse self = new InterpolateVideoFrameResponse();
        return TeaModel.build(map, self);
    }

    public InterpolateVideoFrameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InterpolateVideoFrameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InterpolateVideoFrameResponse setBody(InterpolateVideoFrameResponseBody body) {
        this.body = body;
        return this;
    }
    public InterpolateVideoFrameResponseBody getBody() {
        return this.body;
    }

}
