// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRegionInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRegionInfosResponse setBody(DescribeRegionInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionInfosResponseBody getBody() {
        return this.body;
    }

}
