// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6GatewaySpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIpv6GatewaySpecResponseBody body;

    public static ModifyIpv6GatewaySpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6GatewaySpecResponse self = new ModifyIpv6GatewaySpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6GatewaySpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpv6GatewaySpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIpv6GatewaySpecResponse setBody(ModifyIpv6GatewaySpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpv6GatewaySpecResponseBody getBody() {
        return this.body;
    }

}
