// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReleaseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseProjectResponseBody body;

    public static ReleaseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseProjectResponse self = new ReleaseProjectResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseProjectResponse setBody(ReleaseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseProjectResponseBody getBody() {
        return this.body;
    }

}
