// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNetworkAclAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyNetworkAclAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNetworkAclAttributesResponse setBody(ModifyNetworkAclAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkAclAttributesResponseBody getBody() {
        return this.body;
    }

}
