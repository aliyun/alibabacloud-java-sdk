// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertruleMonitortargetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlertruleMonitortargetsResponseBody body;

    public static QueryRmsAlertruleMonitortargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertruleMonitortargetsResponse self = new QueryRmsAlertruleMonitortargetsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertruleMonitortargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlertruleMonitortargetsResponse setBody(QueryRmsAlertruleMonitortargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlertruleMonitortargetsResponseBody getBody() {
        return this.body;
    }

}
