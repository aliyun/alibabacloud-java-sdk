// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemAggregationRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSystemAggregationRulesResponseBody body;

    public static ListSystemAggregationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemAggregationRulesResponse self = new ListSystemAggregationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemAggregationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemAggregationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemAggregationRulesResponse setBody(ListSystemAggregationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemAggregationRulesResponseBody getBody() {
        return this.body;
    }

}
