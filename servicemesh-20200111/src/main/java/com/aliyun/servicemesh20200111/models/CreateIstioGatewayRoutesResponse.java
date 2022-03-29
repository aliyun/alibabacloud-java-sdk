// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayRoutesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIstioGatewayRoutesResponseBody body;

    public static CreateIstioGatewayRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIstioGatewayRoutesResponse self = new CreateIstioGatewayRoutesResponse();
        return TeaModel.build(map, self);
    }

    public CreateIstioGatewayRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIstioGatewayRoutesResponse setBody(CreateIstioGatewayRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIstioGatewayRoutesResponseBody getBody() {
        return this.body;
    }

}
