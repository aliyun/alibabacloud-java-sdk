// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualPhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVirtualPhysicalConnectionResponseBody body;

    public static CreateVirtualPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualPhysicalConnectionResponse self = new CreateVirtualPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualPhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualPhysicalConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirtualPhysicalConnectionResponse setBody(CreateVirtualPhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
