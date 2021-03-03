// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleCacheStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProtectionRuleCacheStatusResponseBody body;

    public static ModifyProtectionRuleCacheStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleCacheStatusResponse self = new ModifyProtectionRuleCacheStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleCacheStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProtectionRuleCacheStatusResponse setBody(ModifyProtectionRuleCacheStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProtectionRuleCacheStatusResponseBody getBody() {
        return this.body;
    }

}
