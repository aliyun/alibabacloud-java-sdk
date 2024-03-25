// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssObjectsResponseBody body;

    public static DescribeOssObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectsResponse self = new DescribeOssObjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssObjectsResponse setBody(DescribeOssObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssObjectsResponseBody getBody() {
        return this.body;
    }

}
