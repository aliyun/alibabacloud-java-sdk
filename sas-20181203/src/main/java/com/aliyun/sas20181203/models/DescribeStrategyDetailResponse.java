// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStrategyDetailResponseBody body;

    public static DescribeStrategyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyDetailResponse self = new DescribeStrategyDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStrategyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStrategyDetailResponse setBody(DescribeStrategyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStrategyDetailResponseBody getBody() {
        return this.body;
    }

}
