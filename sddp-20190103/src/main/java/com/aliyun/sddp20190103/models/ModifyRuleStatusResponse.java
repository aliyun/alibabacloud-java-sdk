// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRuleStatusResponseBody body;

    public static ModifyRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleStatusResponse self = new ModifyRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRuleStatusResponse setBody(ModifyRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRuleStatusResponseBody getBody() {
        return this.body;
    }

}
