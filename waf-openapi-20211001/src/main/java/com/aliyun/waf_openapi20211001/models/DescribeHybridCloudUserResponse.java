// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudUserResponseBody body;

    public static DescribeHybridCloudUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudUserResponse self = new DescribeHybridCloudUserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudUserResponse setBody(DescribeHybridCloudUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudUserResponseBody getBody() {
        return this.body;
    }

}
