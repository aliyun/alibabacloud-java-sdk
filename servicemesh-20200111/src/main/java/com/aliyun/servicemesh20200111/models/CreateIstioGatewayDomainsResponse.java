// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIstioGatewayDomainsResponseBody body;

    public static CreateIstioGatewayDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIstioGatewayDomainsResponse self = new CreateIstioGatewayDomainsResponse();
        return TeaModel.build(map, self);
    }

    public CreateIstioGatewayDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIstioGatewayDomainsResponse setBody(CreateIstioGatewayDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIstioGatewayDomainsResponseBody getBody() {
        return this.body;
    }

}
