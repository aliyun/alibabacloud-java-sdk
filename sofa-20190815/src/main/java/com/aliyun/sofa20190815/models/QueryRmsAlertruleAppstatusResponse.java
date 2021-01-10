// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertruleAppstatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlertruleAppstatusResponseBody body;

    public static QueryRmsAlertruleAppstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertruleAppstatusResponse self = new QueryRmsAlertruleAppstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertruleAppstatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlertruleAppstatusResponse setBody(QueryRmsAlertruleAppstatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlertruleAppstatusResponseBody getBody() {
        return this.body;
    }

}
