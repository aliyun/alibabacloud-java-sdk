// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkMonitorRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryTrademarkMonitorRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkMonitorRulesResponse setBody(QueryTrademarkMonitorRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkMonitorRulesResponseBody getBody() {
        return this.body;
    }

}
