// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssTokenResponseBody body;

    public static DescribeOssTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssTokenResponse self = new DescribeOssTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssTokenResponse setBody(DescribeOssTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssTokenResponseBody getBody() {
        return this.body;
    }

}
