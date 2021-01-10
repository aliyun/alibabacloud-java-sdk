// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchEnableMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchEnableMsSgAuthRuleGroupsResponseBody body;

    public static BatchEnableMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchEnableMsSgAuthRuleGroupsResponse self = new BatchEnableMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public BatchEnableMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchEnableMsSgAuthRuleGroupsResponse setBody(BatchEnableMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchEnableMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
