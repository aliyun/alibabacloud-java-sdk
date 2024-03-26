// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserTotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribePlayUserTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayUserTotalResponse setBody(DescribePlayUserTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayUserTotalResponseBody getBody() {
        return this.body;
    }

}
