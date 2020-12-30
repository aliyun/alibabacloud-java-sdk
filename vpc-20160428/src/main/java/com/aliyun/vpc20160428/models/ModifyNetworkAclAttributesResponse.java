// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNetworkAclAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNetworkAclAttributesResponseBody body;

    public static ModifyNetworkAclAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkAclAttributesResponse self = new ModifyNetworkAclAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkAclAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkAclAttributesResponse setBody(ModifyNetworkAclAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkAclAttributesResponseBody getBody() {
        return this.body;
    }

}
