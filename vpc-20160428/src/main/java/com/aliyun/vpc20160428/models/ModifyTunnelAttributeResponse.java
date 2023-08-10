// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyTunnelAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTunnelAttributeResponseBody body;

    public static ModifyTunnelAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTunnelAttributeResponse self = new ModifyTunnelAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTunnelAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTunnelAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTunnelAttributeResponse setBody(ModifyTunnelAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTunnelAttributeResponseBody getBody() {
        return this.body;
    }

}
