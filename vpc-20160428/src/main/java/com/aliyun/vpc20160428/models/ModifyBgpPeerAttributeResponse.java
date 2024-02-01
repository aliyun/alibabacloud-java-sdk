// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpPeerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBgpPeerAttributeResponseBody body;

    public static ModifyBgpPeerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpPeerAttributeResponse self = new ModifyBgpPeerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBgpPeerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBgpPeerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBgpPeerAttributeResponse setBody(ModifyBgpPeerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBgpPeerAttributeResponseBody getBody() {
        return this.body;
    }

}
