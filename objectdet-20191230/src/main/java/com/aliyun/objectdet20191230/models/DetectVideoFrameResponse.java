// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoFrameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectVideoFrameResponseBody body;

    public static DetectVideoFrameResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoFrameResponse self = new DetectVideoFrameResponse();
        return TeaModel.build(map, self);
    }

    public DetectVideoFrameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectVideoFrameResponse setBody(DetectVideoFrameResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectVideoFrameResponseBody getBody() {
        return this.body;
    }

}
