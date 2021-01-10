// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgRouterRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsSgRouterRuleGroupsResponseBody body;

    public static UpdateMsSgRouterRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgRouterRuleGroupsResponse self = new UpdateMsSgRouterRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgRouterRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsSgRouterRuleGroupsResponse setBody(UpdateMsSgRouterRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsSgRouterRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
