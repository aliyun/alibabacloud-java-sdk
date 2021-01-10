// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDisableMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDisableMsSgAuthRuleGroupsResponseBody body;

    public static BatchDisableMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDisableMsSgAuthRuleGroupsResponse self = new BatchDisableMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDisableMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDisableMsSgAuthRuleGroupsResponse setBody(BatchDisableMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDisableMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
