// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstancesSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstancesSSLResponseBody body;

    public static ModifyInstancesSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstancesSSLResponse self = new ModifyInstancesSSLResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstancesSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstancesSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstancesSSLResponse setBody(ModifyInstancesSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstancesSSLResponseBody getBody() {
        return this.body;
    }

}
