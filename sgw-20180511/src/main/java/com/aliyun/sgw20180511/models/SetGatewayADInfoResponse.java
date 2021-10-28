// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SetGatewayADInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetGatewayADInfoResponseBody body;

    public static SetGatewayADInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGatewayADInfoResponse self = new SetGatewayADInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetGatewayADInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGatewayADInfoResponse setBody(SetGatewayADInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGatewayADInfoResponseBody getBody() {
        return this.body;
    }

}
