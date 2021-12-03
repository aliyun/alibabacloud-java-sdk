// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class EnableVpcEndpointConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableVpcEndpointConnectionResponseBody body;

    public static EnableVpcEndpointConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcEndpointConnectionResponse self = new EnableVpcEndpointConnectionResponse();
        return TeaModel.build(map, self);
    }

    public EnableVpcEndpointConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableVpcEndpointConnectionResponse setBody(EnableVpcEndpointConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableVpcEndpointConnectionResponseBody getBody() {
        return this.body;
    }

}
