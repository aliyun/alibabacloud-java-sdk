// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVsPullStreamInfoConfigResponseBody body;

    public static DescribeVsPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsPullStreamInfoConfigResponse self = new DescribeVsPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsPullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsPullStreamInfoConfigResponse setBody(DescribeVsPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
