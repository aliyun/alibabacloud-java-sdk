// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceIpWhitelistResponseBody body;

    public static ModifyInstanceIpWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceIpWhitelistResponse self = new ModifyInstanceIpWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceIpWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceIpWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceIpWhitelistResponse setBody(ModifyInstanceIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
