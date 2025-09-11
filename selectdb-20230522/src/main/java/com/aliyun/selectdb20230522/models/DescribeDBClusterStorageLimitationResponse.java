// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBClusterStorageLimitationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterStorageLimitationResponseBody body;

    public static DescribeDBClusterStorageLimitationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterStorageLimitationResponse self = new DescribeDBClusterStorageLimitationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterStorageLimitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterStorageLimitationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterStorageLimitationResponse setBody(DescribeDBClusterStorageLimitationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterStorageLimitationResponseBody getBody() {
        return this.body;
    }

}
