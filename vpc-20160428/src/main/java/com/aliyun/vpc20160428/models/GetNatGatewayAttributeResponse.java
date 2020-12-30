// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatGatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNatGatewayAttributeResponseBody body;

    public static GetNatGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayAttributeResponse self = new GetNatGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNatGatewayAttributeResponse setBody(GetNatGatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNatGatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
