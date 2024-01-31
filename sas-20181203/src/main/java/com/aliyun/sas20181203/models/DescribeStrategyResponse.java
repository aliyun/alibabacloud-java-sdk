// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStrategyResponseBody body;

    public static DescribeStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyResponse self = new DescribeStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStrategyResponse setBody(DescribeStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStrategyResponseBody getBody() {
        return this.body;
    }

}
