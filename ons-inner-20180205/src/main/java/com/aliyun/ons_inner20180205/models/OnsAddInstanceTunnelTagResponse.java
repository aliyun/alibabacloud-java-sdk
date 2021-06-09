// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class OnsAddInstanceTunnelTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsAddInstanceTunnelTagResponseBody body;

    public static OnsAddInstanceTunnelTagResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsAddInstanceTunnelTagResponse self = new OnsAddInstanceTunnelTagResponse();
        return TeaModel.build(map, self);
    }

    public OnsAddInstanceTunnelTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsAddInstanceTunnelTagResponse setBody(OnsAddInstanceTunnelTagResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsAddInstanceTunnelTagResponseBody getBody() {
        return this.body;
    }

}
