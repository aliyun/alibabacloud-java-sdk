// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CloseEngineMigrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseEngineMigrationResponseBody body;

    public static CloseEngineMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseEngineMigrationResponse self = new CloseEngineMigrationResponse();
        return TeaModel.build(map, self);
    }

    public CloseEngineMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseEngineMigrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseEngineMigrationResponse setBody(CloseEngineMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseEngineMigrationResponseBody getBody() {
        return this.body;
    }

}
