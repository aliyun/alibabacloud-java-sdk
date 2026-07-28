// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlowQueryStatsResponseBody body;

    public static DescribeSlowQueryStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryStatsResponse self = new DescribeSlowQueryStatsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowQueryStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlowQueryStatsResponse setBody(DescribeSlowQueryStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowQueryStatsResponseBody getBody() {
        return this.body;
    }

}
