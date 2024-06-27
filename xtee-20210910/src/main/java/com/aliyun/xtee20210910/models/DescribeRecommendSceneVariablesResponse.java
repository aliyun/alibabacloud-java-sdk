// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendSceneVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecommendSceneVariablesResponseBody body;

    public static DescribeRecommendSceneVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendSceneVariablesResponse self = new DescribeRecommendSceneVariablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendSceneVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecommendSceneVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecommendSceneVariablesResponse setBody(DescribeRecommendSceneVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecommendSceneVariablesResponseBody getBody() {
        return this.body;
    }

}
