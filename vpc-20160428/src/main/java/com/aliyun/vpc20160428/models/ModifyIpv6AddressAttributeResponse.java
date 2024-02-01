// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6AddressAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIpv6AddressAttributeResponseBody body;

    public static ModifyIpv6AddressAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6AddressAttributeResponse self = new ModifyIpv6AddressAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6AddressAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpv6AddressAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIpv6AddressAttributeResponse setBody(ModifyIpv6AddressAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpv6AddressAttributeResponseBody getBody() {
        return this.body;
    }

}
