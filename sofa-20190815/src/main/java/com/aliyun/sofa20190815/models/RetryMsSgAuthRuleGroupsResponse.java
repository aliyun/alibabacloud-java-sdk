// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryMsSgAuthRuleGroupsResponseBody body;

    public static RetryMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryMsSgAuthRuleGroupsResponse self = new RetryMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public RetryMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryMsSgAuthRuleGroupsResponse setBody(RetryMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
