// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRuleGroupsResponseBody body;

    public static ListRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleGroupsResponse self = new ListRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuleGroupsResponse setBody(ListRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
