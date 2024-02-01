// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatIpCidrAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyNatIpCidrAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNatIpCidrAttributeResponse setBody(ModifyNatIpCidrAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNatIpCidrAttributeResponseBody getBody() {
        return this.body;
    }

}
