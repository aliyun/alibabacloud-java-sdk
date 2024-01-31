// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterInfoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterInfoListResponseBody body;

    public static DescribeClusterInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterInfoListResponse self = new DescribeClusterInfoListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterInfoListResponse setBody(DescribeClusterInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterInfoListResponseBody getBody() {
        return this.body;
    }

}
