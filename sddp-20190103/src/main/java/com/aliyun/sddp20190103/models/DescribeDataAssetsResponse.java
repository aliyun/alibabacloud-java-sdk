// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataAssetsResponseBody body;

    public static DescribeDataAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAssetsResponse self = new DescribeDataAssetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataAssetsResponse setBody(DescribeDataAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataAssetsResponseBody getBody() {
        return this.body;
    }

}
