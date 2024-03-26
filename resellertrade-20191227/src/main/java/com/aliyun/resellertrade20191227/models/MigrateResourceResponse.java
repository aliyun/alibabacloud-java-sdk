// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class MigrateResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateResourceResponseBody body;

    public static MigrateResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateResourceResponse self = new MigrateResourceResponse();
        return TeaModel.build(map, self);
    }

    public MigrateResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateResourceResponse setBody(MigrateResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateResourceResponseBody getBody() {
        return this.body;
    }

}
