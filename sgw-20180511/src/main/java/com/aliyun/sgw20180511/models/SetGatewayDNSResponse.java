// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SetGatewayDNSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetGatewayDNSResponseBody body;

    public static SetGatewayDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGatewayDNSResponse self = new SetGatewayDNSResponse();
        return TeaModel.build(map, self);
    }

    public SetGatewayDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGatewayDNSResponse setBody(SetGatewayDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGatewayDNSResponseBody getBody() {
        return this.body;
    }

}
