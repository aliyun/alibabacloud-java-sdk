// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConfirmPhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmPhysicalConnectionResponseBody body;

    public static ConfirmPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPhysicalConnectionResponse self = new ConfirmPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmPhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmPhysicalConnectionResponse setBody(ConfirmPhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
