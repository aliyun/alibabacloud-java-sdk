// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalFileResponseBody body;

    public static CreatePersonalFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFileResponse self = new CreatePersonalFileResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalFileResponse setBody(CreatePersonalFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalFileResponseBody getBody() {
        return this.body;
    }

}
