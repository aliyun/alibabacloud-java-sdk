// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleCacheStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyProtectionRuleCacheStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProtectionRuleCacheStatusResponse setBody(ModifyProtectionRuleCacheStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProtectionRuleCacheStatusResponseBody getBody() {
        return this.body;
    }

}
