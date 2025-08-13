// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScoreListResponseBody body;

    public static DescribeScoreListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreListResponse self = new DescribeScoreListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScoreListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScoreListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScoreListResponse setBody(DescribeScoreListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScoreListResponseBody getBody() {
        return this.body;
    }

}
