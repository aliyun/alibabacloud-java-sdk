// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataSourceResponseBody body;

    public static CreateDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceResponse self = new CreateDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataSourceResponse setBody(CreateDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataSourceResponseBody getBody() {
        return this.body;
    }

}
