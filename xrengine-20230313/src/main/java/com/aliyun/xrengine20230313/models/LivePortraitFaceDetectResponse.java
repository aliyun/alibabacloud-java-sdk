// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LivePortraitFaceDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LivePortraitFaceDetectResponseBody body;

    public static LivePortraitFaceDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        LivePortraitFaceDetectResponse self = new LivePortraitFaceDetectResponse();
        return TeaModel.build(map, self);
    }

    public LivePortraitFaceDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LivePortraitFaceDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LivePortraitFaceDetectResponse setBody(LivePortraitFaceDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public LivePortraitFaceDetectResponseBody getBody() {
        return this.body;
    }

}
