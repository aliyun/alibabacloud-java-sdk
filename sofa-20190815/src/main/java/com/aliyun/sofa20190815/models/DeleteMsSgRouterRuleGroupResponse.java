// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgRouterRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsSgRouterRuleGroupResponseBody body;

    public static DeleteMsSgRouterRuleGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgRouterRuleGroupResponse self = new DeleteMsSgRouterRuleGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgRouterRuleGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsSgRouterRuleGroupResponse setBody(DeleteMsSgRouterRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsSgRouterRuleGroupResponseBody getBody() {
        return this.body;
    }

}
