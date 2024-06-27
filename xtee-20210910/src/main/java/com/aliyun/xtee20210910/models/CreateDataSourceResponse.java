// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
