// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListSofaMsSgAuthRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSofaMsSgAuthRuleGroupsResponseBody body;

    public static ListSofaMsSgAuthRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofaMsSgAuthRuleGroupsResponse self = new ListSofaMsSgAuthRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSofaMsSgAuthRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSofaMsSgAuthRuleGroupsResponse setBody(ListSofaMsSgAuthRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSofaMsSgAuthRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
