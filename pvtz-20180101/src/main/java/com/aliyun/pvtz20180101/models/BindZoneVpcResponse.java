// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class BindZoneVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindZoneVpcResponseBody body;

    public static BindZoneVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        BindZoneVpcResponse self = new BindZoneVpcResponse();
        return TeaModel.build(map, self);
    }

    public BindZoneVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindZoneVpcResponse setBody(BindZoneVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public BindZoneVpcResponseBody getBody() {
        return this.body;
    }

}
