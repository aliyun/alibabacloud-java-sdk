// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceStorageConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceStorageConfigResponseBody body;

    public static DescribeInstanceStorageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStorageConfigResponse self = new DescribeInstanceStorageConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStorageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceStorageConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceStorageConfigResponse setBody(DescribeInstanceStorageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceStorageConfigResponseBody getBody() {
        return this.body;
    }

}
