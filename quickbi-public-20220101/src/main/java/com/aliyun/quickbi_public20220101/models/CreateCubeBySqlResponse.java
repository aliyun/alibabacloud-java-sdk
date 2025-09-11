// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateCubeBySqlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCubeBySqlResponseBody body;

    public static CreateCubeBySqlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCubeBySqlResponse self = new CreateCubeBySqlResponse();
        return TeaModel.build(map, self);
    }

    public CreateCubeBySqlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCubeBySqlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCubeBySqlResponse setBody(CreateCubeBySqlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCubeBySqlResponseBody getBody() {
        return this.body;
    }

}
