// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ResetGatewayPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetGatewayPasswordResponseBody body;

    public static ResetGatewayPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetGatewayPasswordResponse self = new ResetGatewayPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetGatewayPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetGatewayPasswordResponse setBody(ResetGatewayPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetGatewayPasswordResponseBody getBody() {
        return this.body;
    }

}
