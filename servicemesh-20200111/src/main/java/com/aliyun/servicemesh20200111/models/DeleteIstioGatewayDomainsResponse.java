// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteIstioGatewayDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIstioGatewayDomainsResponseBody body;

    public static DeleteIstioGatewayDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIstioGatewayDomainsResponse self = new DeleteIstioGatewayDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIstioGatewayDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIstioGatewayDomainsResponse setBody(DeleteIstioGatewayDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIstioGatewayDomainsResponseBody getBody() {
        return this.body;
    }

}
