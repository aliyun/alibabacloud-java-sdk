// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupTrendResponseBody body;

    public static DescribeGroupTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupTrendResponse self = new DescribeGroupTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupTrendResponse setBody(DescribeGroupTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupTrendResponseBody getBody() {
        return this.body;
    }

}
