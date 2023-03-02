// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RestartDatabaseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestartDatabaseInstanceResponseBody body;

    public static RestartDatabaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDatabaseInstanceResponse self = new RestartDatabaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartDatabaseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDatabaseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartDatabaseInstanceResponse setBody(RestartDatabaseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDatabaseInstanceResponseBody getBody() {
        return this.body;
    }

}
