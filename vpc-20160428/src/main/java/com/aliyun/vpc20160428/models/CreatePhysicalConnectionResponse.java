// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePhysicalConnectionResponseBody body;

    public static CreatePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionResponse self = new CreatePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhysicalConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePhysicalConnectionResponse setBody(CreatePhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
