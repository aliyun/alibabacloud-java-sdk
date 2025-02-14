// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyHybridProxyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridProxyPolicyResponseBody body;

    public static ModifyHybridProxyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridProxyPolicyResponse self = new ModifyHybridProxyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridProxyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridProxyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridProxyPolicyResponse setBody(ModifyHybridProxyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridProxyPolicyResponseBody getBody() {
        return this.body;
    }

}
