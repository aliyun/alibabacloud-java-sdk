// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateMySqlDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMySqlDataSourceResponseBody body;

    public static CreateMySqlDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMySqlDataSourceResponse self = new CreateMySqlDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateMySqlDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMySqlDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMySqlDataSourceResponse setBody(CreateMySqlDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMySqlDataSourceResponseBody getBody() {
        return this.body;
    }

}
