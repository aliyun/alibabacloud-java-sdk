// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class QueryPeriodBudgetBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPeriodBudgetBillResponseBody body;

    public static QueryPeriodBudgetBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPeriodBudgetBillResponse self = new QueryPeriodBudgetBillResponse();
        return TeaModel.build(map, self);
    }

    public QueryPeriodBudgetBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPeriodBudgetBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPeriodBudgetBillResponse setBody(QueryPeriodBudgetBillResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPeriodBudgetBillResponseBody getBody() {
        return this.body;
    }

}
