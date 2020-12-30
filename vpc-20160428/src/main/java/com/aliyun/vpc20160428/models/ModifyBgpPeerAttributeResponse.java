// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpPeerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyBgpPeerAttributeResponse setBody(ModifyBgpPeerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBgpPeerAttributeResponseBody getBody() {
        return this.body;
    }

}
