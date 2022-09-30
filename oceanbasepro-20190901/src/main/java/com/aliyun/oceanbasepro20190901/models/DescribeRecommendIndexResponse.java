// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRecommendIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecommendIndexResponseBody body;

    public static DescribeRecommendIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendIndexResponse self = new DescribeRecommendIndexResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecommendIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecommendIndexResponse setBody(DescribeRecommendIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecommendIndexResponseBody getBody() {
        return this.body;
    }

}
