// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserAvgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlayUserAvgResponseBody body;

    public static DescribePlayUserAvgResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayUserAvgResponse self = new DescribePlayUserAvgResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayUserAvgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayUserAvgResponse setBody(DescribePlayUserAvgResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayUserAvgResponseBody getBody() {
        return this.body;
    }

}
