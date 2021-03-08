// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserTotalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlayUserTotalResponseBody body;

    public static DescribePlayUserTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayUserTotalResponse self = new DescribePlayUserTotalResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayUserTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayUserTotalResponse setBody(DescribePlayUserTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayUserTotalResponseBody getBody() {
        return this.body;
    }

}
