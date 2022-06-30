// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddDataSourceResponseBody body;

    public static AddDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceResponse self = new AddDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public AddDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataSourceResponse setBody(AddDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataSourceResponseBody getBody() {
        return this.body;
    }

}
