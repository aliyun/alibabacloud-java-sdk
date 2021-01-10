// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveMsSgAuthRuleGroupsResponseBody body;

    public static SaveMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveMsSgAuthRuleGroupsResponse self = new SaveMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public SaveMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveMsSgAuthRuleGroupsResponse setBody(SaveMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
