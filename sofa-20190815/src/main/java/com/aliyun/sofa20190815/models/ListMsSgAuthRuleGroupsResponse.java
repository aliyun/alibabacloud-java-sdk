// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgAuthRuleGroupsResponseBody body;

    public static ListMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleGroupsResponse self = new ListMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgAuthRuleGroupsResponse setBody(ListMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
