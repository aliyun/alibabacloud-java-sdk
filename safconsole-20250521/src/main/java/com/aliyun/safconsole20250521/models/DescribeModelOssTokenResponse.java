// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelOssTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelOssTokenResponseBody body;

    public static DescribeModelOssTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOssTokenResponse self = new DescribeModelOssTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelOssTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelOssTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelOssTokenResponse setBody(DescribeModelOssTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelOssTokenResponseBody getBody() {
        return this.body;
    }

}
