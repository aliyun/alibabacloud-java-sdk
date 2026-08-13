// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAlidingDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalAlidingDocResponseBody body;

    public static CreatePersonalAlidingDocResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalAlidingDocResponse self = new CreatePersonalAlidingDocResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalAlidingDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalAlidingDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalAlidingDocResponse setBody(CreatePersonalAlidingDocResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalAlidingDocResponseBody getBody() {
        return this.body;
    }

}
