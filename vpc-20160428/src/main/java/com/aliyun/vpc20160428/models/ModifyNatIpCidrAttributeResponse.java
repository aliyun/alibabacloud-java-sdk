// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatIpCidrAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNatIpCidrAttributeResponseBody body;

    public static ModifyNatIpCidrAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatIpCidrAttributeResponse self = new ModifyNatIpCidrAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNatIpCidrAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNatIpCidrAttributeResponse setBody(ModifyNatIpCidrAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNatIpCidrAttributeResponseBody getBody() {
        return this.body;
    }

}
