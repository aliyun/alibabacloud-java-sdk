// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class OnsRemoveInstanceTunnelTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsRemoveInstanceTunnelTagResponseBody body;

    public static OnsRemoveInstanceTunnelTagResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsRemoveInstanceTunnelTagResponse self = new OnsRemoveInstanceTunnelTagResponse();
        return TeaModel.build(map, self);
    }

    public OnsRemoveInstanceTunnelTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsRemoveInstanceTunnelTagResponse setBody(OnsRemoveInstanceTunnelTagResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsRemoveInstanceTunnelTagResponseBody getBody() {
        return this.body;
    }

}
