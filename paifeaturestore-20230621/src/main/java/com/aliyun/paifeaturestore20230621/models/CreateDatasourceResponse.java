// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateDatasourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDatasourceResponseBody body;

    public static CreateDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasourceResponse self = new CreateDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasourceResponse setBody(CreateDatasourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasourceResponseBody getBody() {
        return this.body;
    }

}
