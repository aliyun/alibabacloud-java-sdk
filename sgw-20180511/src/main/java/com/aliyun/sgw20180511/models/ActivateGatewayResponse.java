// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ActivateGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivateGatewayResponseBody body;

    public static ActivateGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateGatewayResponse self = new ActivateGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ActivateGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateGatewayResponse setBody(ActivateGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateGatewayResponseBody getBody() {
        return this.body;
    }

}
