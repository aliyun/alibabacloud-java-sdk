// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserAssetResponseBody body;

    public static DescribeUserAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAssetResponse self = new DescribeUserAssetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserAssetResponse setBody(DescribeUserAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserAssetResponseBody getBody() {
        return this.body;
    }

}
