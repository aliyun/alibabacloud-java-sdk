// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComponentAssetsResponseBody body;

    public static DescribeComponentAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentAssetsResponse self = new DescribeComponentAssetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComponentAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComponentAssetsResponse setBody(DescribeComponentAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComponentAssetsResponseBody getBody() {
        return this.body;
    }

}
