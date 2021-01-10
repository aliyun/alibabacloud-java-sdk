// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchAddMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchAddMsSgAuthRuleGroupsResponseBody body;

    public static BatchAddMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddMsSgAuthRuleGroupsResponse self = new BatchAddMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddMsSgAuthRuleGroupsResponse setBody(BatchAddMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
