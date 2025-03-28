// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceStorageResponseBody body;

    public static DescribeInstanceStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStorageResponse self = new DescribeInstanceStorageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceStorageResponse setBody(DescribeInstanceStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceStorageResponseBody getBody() {
        return this.body;
    }

}
