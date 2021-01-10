// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMsSgAuthRuleGroupsResponseBody body;

    public static DisableMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMsSgAuthRuleGroupsResponse self = new DisableMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DisableMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMsSgAuthRuleGroupsResponse setBody(DisableMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
