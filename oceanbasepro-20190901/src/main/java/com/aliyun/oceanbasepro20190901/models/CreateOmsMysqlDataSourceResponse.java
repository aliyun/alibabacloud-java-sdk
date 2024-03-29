// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsMysqlDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOmsMysqlDataSourceResponseBody body;

    public static CreateOmsMysqlDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsMysqlDataSourceResponse self = new CreateOmsMysqlDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateOmsMysqlDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOmsMysqlDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOmsMysqlDataSourceResponse setBody(CreateOmsMysqlDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOmsMysqlDataSourceResponseBody getBody() {
        return this.body;
    }

}
