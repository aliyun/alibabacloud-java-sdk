// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRegionInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRegionInfosResponseBody body;

    public static DescribeRegionInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionInfosResponse self = new DescribeRegionInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRegionInfosResponse setBody(DescribeRegionInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionInfosResponseBody getBody() {
        return this.body;
    }

}
