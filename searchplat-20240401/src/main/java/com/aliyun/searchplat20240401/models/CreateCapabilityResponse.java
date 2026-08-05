// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateCapabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCapabilityResponseBody body;

    public static CreateCapabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCapabilityResponse self = new CreateCapabilityResponse();
        return TeaModel.build(map, self);
    }

    public CreateCapabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCapabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCapabilityResponse setBody(CreateCapabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCapabilityResponseBody getBody() {
        return this.body;
    }

}
