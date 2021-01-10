// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleAllAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgRouterRuleAllAppsResponseBody body;

    public static ListMsSgRouterRuleAllAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleAllAppsResponse self = new ListMsSgRouterRuleAllAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleAllAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgRouterRuleAllAppsResponse setBody(ListMsSgRouterRuleAllAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgRouterRuleAllAppsResponseBody getBody() {
        return this.body;
    }

}
