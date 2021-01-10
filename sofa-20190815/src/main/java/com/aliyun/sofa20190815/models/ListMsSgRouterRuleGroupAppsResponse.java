// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleGroupAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgRouterRuleGroupAppsResponseBody body;

    public static ListMsSgRouterRuleGroupAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleGroupAppsResponse self = new ListMsSgRouterRuleGroupAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleGroupAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgRouterRuleGroupAppsResponse setBody(ListMsSgRouterRuleGroupAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgRouterRuleGroupAppsResponseBody getBody() {
        return this.body;
    }

}
