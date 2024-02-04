// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateRdsPostgreSQLDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRdsPostgreSQLDataSourceResponseBody body;

    public static CreateRdsPostgreSQLDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRdsPostgreSQLDataSourceResponse self = new CreateRdsPostgreSQLDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRdsPostgreSQLDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRdsPostgreSQLDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRdsPostgreSQLDataSourceResponse setBody(CreateRdsPostgreSQLDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRdsPostgreSQLDataSourceResponseBody getBody() {
        return this.body;
    }

}
