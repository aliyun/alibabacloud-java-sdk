// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVirtualPhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVirtualPhysicalConnectionResponseBody body;

    public static UpdateVirtualPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualPhysicalConnectionResponse self = new UpdateVirtualPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualPhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVirtualPhysicalConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVirtualPhysicalConnectionResponse setBody(UpdateVirtualPhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVirtualPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
