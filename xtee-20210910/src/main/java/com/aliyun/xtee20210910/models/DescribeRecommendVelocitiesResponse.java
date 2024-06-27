// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendVelocitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecommendVelocitiesResponseBody body;

    public static DescribeRecommendVelocitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendVelocitiesResponse self = new DescribeRecommendVelocitiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendVelocitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecommendVelocitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecommendVelocitiesResponse setBody(DescribeRecommendVelocitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecommendVelocitiesResponseBody getBody() {
        return this.body;
    }

}
