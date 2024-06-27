// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendVariablesVelocityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecommendVariablesVelocityResponseBody body;

    public static DescribeRecommendVariablesVelocityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendVariablesVelocityResponse self = new DescribeRecommendVariablesVelocityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendVariablesVelocityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecommendVariablesVelocityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecommendVariablesVelocityResponse setBody(DescribeRecommendVariablesVelocityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecommendVariablesVelocityResponseBody getBody() {
        return this.body;
    }

}
