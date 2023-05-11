// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBResponseBody body;

    public static CreateDBResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResponse self = new CreateDBResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBResponse setBody(CreateDBResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBResponseBody getBody() {
        return this.body;
    }

}
