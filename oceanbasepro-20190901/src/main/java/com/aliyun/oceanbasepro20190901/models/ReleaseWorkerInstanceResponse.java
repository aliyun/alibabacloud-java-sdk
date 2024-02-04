// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReleaseWorkerInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseWorkerInstanceResponseBody body;

    public static ReleaseWorkerInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseWorkerInstanceResponse self = new ReleaseWorkerInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseWorkerInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseWorkerInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseWorkerInstanceResponse setBody(ReleaseWorkerInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseWorkerInstanceResponseBody getBody() {
        return this.body;
    }

}
