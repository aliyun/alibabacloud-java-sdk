// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRegionResponseBody body;

    public static DescribeRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionResponse self = new DescribeRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionResponse setBody(DescribeRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionResponseBody getBody() {
        return this.body;
    }

}
