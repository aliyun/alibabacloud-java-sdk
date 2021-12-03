// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DisableVpcEndpointConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableVpcEndpointConnectionResponseBody body;

    public static DisableVpcEndpointConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcEndpointConnectionResponse self = new DisableVpcEndpointConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DisableVpcEndpointConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableVpcEndpointConnectionResponse setBody(DisableVpcEndpointConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableVpcEndpointConnectionResponseBody getBody() {
        return this.body;
    }

}
