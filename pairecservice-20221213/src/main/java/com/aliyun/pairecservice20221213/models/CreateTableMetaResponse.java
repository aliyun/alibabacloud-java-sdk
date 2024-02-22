// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTableMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTableMetaResponseBody body;

    public static CreateTableMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTableMetaResponse self = new CreateTableMetaResponse();
        return TeaModel.build(map, self);
    }

    public CreateTableMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTableMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTableMetaResponse setBody(CreateTableMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTableMetaResponseBody getBody() {
        return this.body;
    }

}
