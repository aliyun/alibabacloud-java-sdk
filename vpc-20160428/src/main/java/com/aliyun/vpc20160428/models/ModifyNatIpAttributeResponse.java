// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatIpAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNatIpAttributeResponseBody body;

    public static ModifyNatIpAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatIpAttributeResponse self = new ModifyNatIpAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNatIpAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNatIpAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNatIpAttributeResponse setBody(ModifyNatIpAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNatIpAttributeResponseBody getBody() {
        return this.body;
    }

}
