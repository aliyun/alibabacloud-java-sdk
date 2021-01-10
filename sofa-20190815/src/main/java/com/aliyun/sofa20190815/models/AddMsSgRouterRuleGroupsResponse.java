// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgRouterRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsSgRouterRuleGroupsResponseBody body;

    public static AddMsSgRouterRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgRouterRuleGroupsResponse self = new AddMsSgRouterRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public AddMsSgRouterRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsSgRouterRuleGroupsResponse setBody(AddMsSgRouterRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsSgRouterRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
