// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class RollbackModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackModelResponseBody body;

    public static RollbackModelResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackModelResponse self = new RollbackModelResponse();
        return TeaModel.build(map, self);
    }

    public RollbackModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackModelResponse setBody(RollbackModelResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackModelResponseBody getBody() {
        return this.body;
    }

}
