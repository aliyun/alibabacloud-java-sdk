// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ContentSyncDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContentSyncDetectResponseBody body;

    public static ContentSyncDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        ContentSyncDetectResponse self = new ContentSyncDetectResponse();
        return TeaModel.build(map, self);
    }

    public ContentSyncDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContentSyncDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContentSyncDetectResponse setBody(ContentSyncDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public ContentSyncDetectResponseBody getBody() {
        return this.body;
    }

}
