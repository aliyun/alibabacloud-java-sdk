// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeVsPullStreamInfoConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsPullStreamInfoConfigResponse setBody(DescribeVsPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
