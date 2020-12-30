// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWhiteBaseImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectWhiteBaseImageResponseBody body;

    public static DetectWhiteBaseImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectWhiteBaseImageResponse self = new DetectWhiteBaseImageResponse();
        return TeaModel.build(map, self);
    }

    public DetectWhiteBaseImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectWhiteBaseImageResponse setBody(DetectWhiteBaseImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectWhiteBaseImageResponseBody getBody() {
        return this.body;
    }

}
