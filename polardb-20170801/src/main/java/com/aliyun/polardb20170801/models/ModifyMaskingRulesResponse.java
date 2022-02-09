// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyMaskingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMaskingRulesResponseBody body;

    public static ModifyMaskingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaskingRulesResponse self = new ModifyMaskingRulesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMaskingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMaskingRulesResponse setBody(ModifyMaskingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaskingRulesResponseBody getBody() {
        return this.body;
    }

}
