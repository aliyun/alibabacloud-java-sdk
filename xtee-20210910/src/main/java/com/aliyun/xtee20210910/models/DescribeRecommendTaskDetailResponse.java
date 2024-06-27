// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecommendTaskDetailResponseBody body;

    public static DescribeRecommendTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendTaskDetailResponse self = new DescribeRecommendTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecommendTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecommendTaskDetailResponse setBody(DescribeRecommendTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecommendTaskDetailResponseBody getBody() {
        return this.body;
    }

}
