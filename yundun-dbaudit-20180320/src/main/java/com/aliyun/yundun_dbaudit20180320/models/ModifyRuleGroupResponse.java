// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRuleGroupResponseBody body;

    public static ModifyRuleGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleGroupResponse self = new ModifyRuleGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRuleGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRuleGroupResponse setBody(ModifyRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRuleGroupResponseBody getBody() {
        return this.body;
    }

}
