// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class InsertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsertResponseBody body;

    public static InsertResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertResponse self = new InsertResponse();
        return TeaModel.build(map, self);
    }

    public InsertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertResponse setBody(InsertResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertResponseBody getBody() {
        return this.body;
    }

}
