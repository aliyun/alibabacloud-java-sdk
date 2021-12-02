// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetIpv4GatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIpv4GatewayAttributeResponseBody body;

    public static GetIpv4GatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpv4GatewayAttributeResponse self = new GetIpv4GatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetIpv4GatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpv4GatewayAttributeResponse setBody(GetIpv4GatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpv4GatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
