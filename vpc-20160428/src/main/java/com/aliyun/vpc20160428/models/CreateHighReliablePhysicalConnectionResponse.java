// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateHighReliablePhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHighReliablePhysicalConnectionResponseBody body;

    public static CreateHighReliablePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHighReliablePhysicalConnectionResponse self = new CreateHighReliablePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateHighReliablePhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHighReliablePhysicalConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHighReliablePhysicalConnectionResponse setBody(CreateHighReliablePhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHighReliablePhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
