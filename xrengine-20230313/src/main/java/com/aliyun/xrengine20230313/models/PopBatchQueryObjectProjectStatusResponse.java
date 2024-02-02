// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBatchQueryObjectProjectStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopBatchQueryObjectProjectStatusResponseBody body;

    public static PopBatchQueryObjectProjectStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PopBatchQueryObjectProjectStatusResponse self = new PopBatchQueryObjectProjectStatusResponse();
        return TeaModel.build(map, self);
    }

    public PopBatchQueryObjectProjectStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopBatchQueryObjectProjectStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopBatchQueryObjectProjectStatusResponse setBody(PopBatchQueryObjectProjectStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public PopBatchQueryObjectProjectStatusResponseBody getBody() {
        return this.body;
    }

}
