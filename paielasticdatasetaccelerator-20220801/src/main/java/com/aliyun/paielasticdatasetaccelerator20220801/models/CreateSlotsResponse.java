// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateSlotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSlotsResponseBody body;

    public static CreateSlotsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSlotsResponse self = new CreateSlotsResponse();
        return TeaModel.build(map, self);
    }

    public CreateSlotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSlotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSlotsResponse setBody(CreateSlotsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSlotsResponseBody getBody() {
        return this.body;
    }

}
