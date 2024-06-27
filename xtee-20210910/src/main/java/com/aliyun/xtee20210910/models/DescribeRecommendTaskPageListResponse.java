// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendTaskPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecommendTaskPageListResponseBody body;

    public static DescribeRecommendTaskPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendTaskPageListResponse self = new DescribeRecommendTaskPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendTaskPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecommendTaskPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecommendTaskPageListResponse setBody(DescribeRecommendTaskPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecommendTaskPageListResponseBody getBody() {
        return this.body;
    }

}
