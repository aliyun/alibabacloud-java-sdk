// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateCertsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCertsResponseBody body;

    public static CreateCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertsResponse self = new CreateCertsResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCertsResponse setBody(CreateCertsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertsResponseBody getBody() {
        return this.body;
    }

}
