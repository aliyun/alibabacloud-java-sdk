// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkMonitorRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTrademarkMonitorRulesResponseBody body;

    public static QueryTrademarkMonitorRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkMonitorRulesResponse self = new QueryTrademarkMonitorRulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkMonitorRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkMonitorRulesResponse setBody(QueryTrademarkMonitorRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkMonitorRulesResponseBody getBody() {
        return this.body;
    }

}
