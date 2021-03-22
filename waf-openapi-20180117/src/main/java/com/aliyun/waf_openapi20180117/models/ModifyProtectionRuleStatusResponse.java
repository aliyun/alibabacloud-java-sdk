// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProtectionRuleStatusResponseBody body;

    public static ModifyProtectionRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleStatusResponse self = new ModifyProtectionRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProtectionRuleStatusResponse setBody(ModifyProtectionRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProtectionRuleStatusResponseBody getBody() {
        return this.body;
    }

}
