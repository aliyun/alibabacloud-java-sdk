// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateCustomEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomEndpointResponseBody body;

    public static CreateCustomEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomEndpointResponse self = new CreateCustomEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomEndpointResponse setBody(CreateCustomEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomEndpointResponseBody getBody() {
        return this.body;
    }

}
