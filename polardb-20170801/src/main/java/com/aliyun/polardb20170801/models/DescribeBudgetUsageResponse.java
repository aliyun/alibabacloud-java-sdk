// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBudgetUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBudgetUsageResponseBody body;

    public static DescribeBudgetUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetUsageResponse self = new DescribeBudgetUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBudgetUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBudgetUsageResponse setBody(DescribeBudgetUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBudgetUsageResponseBody getBody() {
        return this.body;
    }

}
