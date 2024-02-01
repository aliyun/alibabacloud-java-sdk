// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6GatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIpv6GatewayAttributeResponseBody body;

    public static ModifyIpv6GatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6GatewayAttributeResponse self = new ModifyIpv6GatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6GatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpv6GatewayAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIpv6GatewayAttributeResponse setBody(ModifyIpv6GatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpv6GatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
