// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsRuleGroupByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsRuleGroupByNameResponseBody body;

    public static QueryRmsRuleGroupByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsRuleGroupByNameResponse self = new QueryRmsRuleGroupByNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsRuleGroupByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsRuleGroupByNameResponse setBody(QueryRmsRuleGroupByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsRuleGroupByNameResponseBody getBody() {
        return this.body;
    }

}
