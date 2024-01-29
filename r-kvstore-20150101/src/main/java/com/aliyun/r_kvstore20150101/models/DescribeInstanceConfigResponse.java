// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceConfigResponseBody body;

    public static DescribeInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigResponse self = new DescribeInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceConfigResponse setBody(DescribeInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
