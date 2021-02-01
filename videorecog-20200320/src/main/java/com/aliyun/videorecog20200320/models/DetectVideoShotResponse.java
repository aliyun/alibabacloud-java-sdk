// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class DetectVideoShotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectVideoShotResponseBody body;

    public static DetectVideoShotResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoShotResponse self = new DetectVideoShotResponse();
        return TeaModel.build(map, self);
    }

    public DetectVideoShotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectVideoShotResponse setBody(DetectVideoShotResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectVideoShotResponseBody getBody() {
        return this.body;
    }

}
