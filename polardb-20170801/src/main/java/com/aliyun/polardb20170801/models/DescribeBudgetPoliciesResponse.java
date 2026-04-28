// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBudgetPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBudgetPoliciesResponseBody body;

    public static DescribeBudgetPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetPoliciesResponse self = new DescribeBudgetPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBudgetPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBudgetPoliciesResponse setBody(DescribeBudgetPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBudgetPoliciesResponseBody getBody() {
        return this.body;
    }

}
