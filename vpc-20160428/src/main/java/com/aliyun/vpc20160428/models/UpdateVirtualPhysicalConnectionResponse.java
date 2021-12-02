// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVirtualPhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateVirtualPhysicalConnectionResponse setBody(UpdateVirtualPhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVirtualPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
