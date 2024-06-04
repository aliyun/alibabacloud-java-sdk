// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecAssetTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecAssetTrendResponseBody body;

    public static DescribeApisecAssetTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecAssetTrendResponse self = new DescribeApisecAssetTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecAssetTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecAssetTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecAssetTrendResponse setBody(DescribeApisecAssetTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecAssetTrendResponseBody getBody() {
        return this.body;
    }

}
