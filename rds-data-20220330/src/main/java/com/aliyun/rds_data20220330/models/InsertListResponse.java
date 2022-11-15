// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class InsertListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsertListResponseBody body;

    public static InsertListResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertListResponse self = new InsertListResponse();
        return TeaModel.build(map, self);
    }

    public InsertListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertListResponse setBody(InsertListResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertListResponseBody getBody() {
        return this.body;
    }

}
