// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ResetDatabaseAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResetDatabaseAccountPasswordResponseBody body;

    public static ResetDatabaseAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDatabaseAccountPasswordResponse self = new ResetDatabaseAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetDatabaseAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDatabaseAccountPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDatabaseAccountPasswordResponse setBody(ResetDatabaseAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDatabaseAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
