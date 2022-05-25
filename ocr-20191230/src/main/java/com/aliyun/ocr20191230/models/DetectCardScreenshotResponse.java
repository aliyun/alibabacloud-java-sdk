// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class DetectCardScreenshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectCardScreenshotResponseBody body;

    public static DetectCardScreenshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectCardScreenshotResponse self = new DetectCardScreenshotResponse();
        return TeaModel.build(map, self);
    }

    public DetectCardScreenshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectCardScreenshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectCardScreenshotResponse setBody(DetectCardScreenshotResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectCardScreenshotResponseBody getBody() {
        return this.body;
    }

}
