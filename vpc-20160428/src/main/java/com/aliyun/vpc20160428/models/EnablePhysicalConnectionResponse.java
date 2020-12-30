// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnablePhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnablePhysicalConnectionResponseBody body;

    public static EnablePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnablePhysicalConnectionResponse self = new EnablePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public EnablePhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnablePhysicalConnectionResponse setBody(EnablePhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnablePhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
