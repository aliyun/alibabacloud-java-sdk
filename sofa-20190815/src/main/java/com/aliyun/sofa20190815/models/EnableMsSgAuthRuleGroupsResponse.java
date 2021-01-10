// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMsSgAuthRuleGroupsResponseBody body;

    public static EnableMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgAuthRuleGroupsResponse self = new EnableMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public EnableMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMsSgAuthRuleGroupsResponse setBody(EnableMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
