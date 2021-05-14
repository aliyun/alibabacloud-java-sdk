// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCreateVulWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCreateVulWhitelistResponseBody body;

    public static ModifyCreateVulWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCreateVulWhitelistResponse self = new ModifyCreateVulWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCreateVulWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCreateVulWhitelistResponse setBody(ModifyCreateVulWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCreateVulWhitelistResponseBody getBody() {
        return this.body;
    }

}
