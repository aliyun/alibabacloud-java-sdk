// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopProjectResponseBody body;

    public static StopProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        StopProjectResponse self = new StopProjectResponse();
        return TeaModel.build(map, self);
    }

    public StopProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopProjectResponse setBody(StopProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public StopProjectResponseBody getBody() {
        return this.body;
    }

}
