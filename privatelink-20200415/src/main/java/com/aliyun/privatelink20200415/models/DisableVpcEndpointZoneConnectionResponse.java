// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DisableVpcEndpointZoneConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableVpcEndpointZoneConnectionResponseBody body;

    public static DisableVpcEndpointZoneConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcEndpointZoneConnectionResponse self = new DisableVpcEndpointZoneConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DisableVpcEndpointZoneConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableVpcEndpointZoneConnectionResponse setBody(DisableVpcEndpointZoneConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableVpcEndpointZoneConnectionResponseBody getBody() {
        return this.body;
    }

}
