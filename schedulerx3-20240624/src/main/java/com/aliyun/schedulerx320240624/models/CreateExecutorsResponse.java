// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateExecutorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExecutorsResponseBody body;

    public static CreateExecutorsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExecutorsResponse self = new CreateExecutorsResponse();
        return TeaModel.build(map, self);
    }

    public CreateExecutorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExecutorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExecutorsResponse setBody(CreateExecutorsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExecutorsResponseBody getBody() {
        return this.body;
    }

}
