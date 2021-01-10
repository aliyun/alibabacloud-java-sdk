// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleGroupAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgAuthRuleGroupAppsResponseBody body;

    public static ListMsSgAuthRuleGroupAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleGroupAppsResponse self = new ListMsSgAuthRuleGroupAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleGroupAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgAuthRuleGroupAppsResponse setBody(ListMsSgAuthRuleGroupAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgAuthRuleGroupAppsResponseBody getBody() {
        return this.body;
    }

}
