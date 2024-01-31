// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemRuleAggregationTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSystemRuleAggregationTypesResponseBody body;

    public static ListSystemRuleAggregationTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemRuleAggregationTypesResponse self = new ListSystemRuleAggregationTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemRuleAggregationTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemRuleAggregationTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemRuleAggregationTypesResponse setBody(ListSystemRuleAggregationTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemRuleAggregationTypesResponseBody getBody() {
        return this.body;
    }

}
