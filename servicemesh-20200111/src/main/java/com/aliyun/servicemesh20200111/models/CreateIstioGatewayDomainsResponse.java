// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateIstioGatewayDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIstioGatewayDomainsResponse setBody(CreateIstioGatewayDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIstioGatewayDomainsResponseBody getBody() {
        return this.body;
    }

}
