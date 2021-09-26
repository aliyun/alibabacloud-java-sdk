// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRuleGroupResponseBody body;

    public static CreateRuleGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleGroupResponse self = new CreateRuleGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateRuleGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRuleGroupResponse setBody(CreateRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRuleGroupResponseBody getBody() {
        return this.body;
    }

}
