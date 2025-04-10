// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ContentAsyncDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContentAsyncDetectResponseBody body;

    public static ContentAsyncDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        ContentAsyncDetectResponse self = new ContentAsyncDetectResponse();
        return TeaModel.build(map, self);
    }

    public ContentAsyncDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContentAsyncDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContentAsyncDetectResponse setBody(ContentAsyncDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public ContentAsyncDetectResponseBody getBody() {
        return this.body;
    }

}
