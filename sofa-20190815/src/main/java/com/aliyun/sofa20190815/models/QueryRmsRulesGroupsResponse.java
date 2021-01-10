// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsRulesGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsRulesGroupsResponseBody body;

    public static QueryRmsRulesGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsRulesGroupsResponse self = new QueryRmsRulesGroupsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsRulesGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsRulesGroupsResponse setBody(QueryRmsRulesGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsRulesGroupsResponseBody getBody() {
        return this.body;
    }

}
