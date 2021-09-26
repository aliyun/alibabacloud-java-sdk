// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DeleteRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRuleGroupResponseBody body;

    public static DeleteRuleGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleGroupResponse self = new DeleteRuleGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRuleGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRuleGroupResponse setBody(DeleteRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRuleGroupResponseBody getBody() {
        return this.body;
    }

}
