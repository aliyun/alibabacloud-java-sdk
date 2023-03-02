// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class StopDatabaseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopDatabaseInstanceResponseBody body;

    public static StopDatabaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDatabaseInstanceResponse self = new StopDatabaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopDatabaseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDatabaseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDatabaseInstanceResponse setBody(StopDatabaseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDatabaseInstanceResponseBody getBody() {
        return this.body;
    }

}
