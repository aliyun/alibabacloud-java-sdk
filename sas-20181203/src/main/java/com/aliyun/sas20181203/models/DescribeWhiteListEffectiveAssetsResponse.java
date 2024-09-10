// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListEffectiveAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhiteListEffectiveAssetsResponseBody body;

    public static DescribeWhiteListEffectiveAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListEffectiveAssetsResponse self = new DescribeWhiteListEffectiveAssetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListEffectiveAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteListEffectiveAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhiteListEffectiveAssetsResponse setBody(DescribeWhiteListEffectiveAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteListEffectiveAssetsResponseBody getBody() {
        return this.body;
    }

}
