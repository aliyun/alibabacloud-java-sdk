// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateSlotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSlotResponseBody body;

    public static CreateSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSlotResponse self = new CreateSlotResponse();
        return TeaModel.build(map, self);
    }

    public CreateSlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSlotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSlotResponse setBody(CreateSlotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSlotResponseBody getBody() {
        return this.body;
    }

}
