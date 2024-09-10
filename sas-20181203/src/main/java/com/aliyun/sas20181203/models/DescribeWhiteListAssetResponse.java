// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhiteListAssetResponseBody body;

    public static DescribeWhiteListAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListAssetResponse self = new DescribeWhiteListAssetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteListAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhiteListAssetResponse setBody(DescribeWhiteListAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteListAssetResponseBody getBody() {
        return this.body;
    }

}
