// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class StartDatabaseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartDatabaseInstanceResponseBody body;

    public static StartDatabaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDatabaseInstanceResponse self = new StartDatabaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartDatabaseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDatabaseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDatabaseInstanceResponse setBody(StartDatabaseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDatabaseInstanceResponseBody getBody() {
        return this.body;
    }

}
