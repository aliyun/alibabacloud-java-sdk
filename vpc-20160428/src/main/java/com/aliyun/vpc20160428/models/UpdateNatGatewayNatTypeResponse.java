// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNatGatewayNatTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNatGatewayNatTypeResponseBody body;

    public static UpdateNatGatewayNatTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNatGatewayNatTypeResponse self = new UpdateNatGatewayNatTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNatGatewayNatTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNatGatewayNatTypeResponse setBody(UpdateNatGatewayNatTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNatGatewayNatTypeResponseBody getBody() {
        return this.body;
    }

}
