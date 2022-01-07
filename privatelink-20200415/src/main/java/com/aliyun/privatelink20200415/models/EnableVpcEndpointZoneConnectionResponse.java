// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class EnableVpcEndpointZoneConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableVpcEndpointZoneConnectionResponseBody body;

    public static EnableVpcEndpointZoneConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcEndpointZoneConnectionResponse self = new EnableVpcEndpointZoneConnectionResponse();
        return TeaModel.build(map, self);
    }

    public EnableVpcEndpointZoneConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableVpcEndpointZoneConnectionResponse setBody(EnableVpcEndpointZoneConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableVpcEndpointZoneConnectionResponseBody getBody() {
        return this.body;
    }

}
