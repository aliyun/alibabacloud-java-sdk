// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDatabaseZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatabaseZonalResponseBody body;

    public static CreateDatabaseZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseZonalResponse self = new CreateDatabaseZonalResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatabaseZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatabaseZonalResponse setBody(CreateDatabaseZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatabaseZonalResponseBody getBody() {
        return this.body;
    }

}
