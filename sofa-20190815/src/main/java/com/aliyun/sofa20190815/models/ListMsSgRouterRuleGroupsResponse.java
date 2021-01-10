// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgRouterRuleGroupsResponseBody body;

    public static ListMsSgRouterRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleGroupsResponse self = new ListMsSgRouterRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgRouterRuleGroupsResponse setBody(ListMsSgRouterRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgRouterRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
