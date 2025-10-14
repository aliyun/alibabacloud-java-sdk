// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCustomEndpointListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomEndpointListResponseBody body;

    public static DescribeCustomEndpointListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEndpointListResponse self = new DescribeCustomEndpointListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEndpointListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomEndpointListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomEndpointListResponse setBody(DescribeCustomEndpointListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomEndpointListResponseBody getBody() {
        return this.body;
    }

}
