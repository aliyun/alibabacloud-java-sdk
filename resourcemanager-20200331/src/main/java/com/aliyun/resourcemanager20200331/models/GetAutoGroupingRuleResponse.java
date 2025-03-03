// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAutoGroupingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoGroupingRuleResponseBody body;

    public static GetAutoGroupingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoGroupingRuleResponse self = new GetAutoGroupingRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoGroupingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoGroupingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoGroupingRuleResponse setBody(GetAutoGroupingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoGroupingRuleResponseBody getBody() {
        return this.body;
    }

}
