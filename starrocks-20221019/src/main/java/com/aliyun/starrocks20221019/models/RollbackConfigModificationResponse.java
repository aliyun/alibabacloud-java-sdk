// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RollbackConfigModificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackConfigModificationResponseBody body;

    public static RollbackConfigModificationResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackConfigModificationResponse self = new RollbackConfigModificationResponse();
        return TeaModel.build(map, self);
    }

    public RollbackConfigModificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackConfigModificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackConfigModificationResponse setBody(RollbackConfigModificationResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackConfigModificationResponseBody getBody() {
        return this.body;
    }

}
