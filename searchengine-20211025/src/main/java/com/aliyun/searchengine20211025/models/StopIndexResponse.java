// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class StopIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopIndexResponseBody body;

    public static StopIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        StopIndexResponse self = new StopIndexResponse();
        return TeaModel.build(map, self);
    }

    public StopIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopIndexResponse setBody(StopIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public StopIndexResponseBody getBody() {
        return this.body;
    }

}
