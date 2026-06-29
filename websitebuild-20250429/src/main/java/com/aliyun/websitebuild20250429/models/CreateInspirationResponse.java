// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateInspirationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInspirationResponseBody body;

    public static CreateInspirationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInspirationResponse self = new CreateInspirationResponse();
        return TeaModel.build(map, self);
    }

    public CreateInspirationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInspirationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInspirationResponse setBody(CreateInspirationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInspirationResponseBody getBody() {
        return this.body;
    }

}
