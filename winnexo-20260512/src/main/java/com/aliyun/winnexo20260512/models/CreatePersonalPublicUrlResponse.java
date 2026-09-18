// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalPublicUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalPublicUrlResponseBody body;

    public static CreatePersonalPublicUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalPublicUrlResponse self = new CreatePersonalPublicUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalPublicUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalPublicUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalPublicUrlResponse setBody(CreatePersonalPublicUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalPublicUrlResponseBody getBody() {
        return this.body;
    }

}
