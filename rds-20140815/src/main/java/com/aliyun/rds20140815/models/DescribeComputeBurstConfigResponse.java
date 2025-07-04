// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeComputeBurstConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComputeBurstConfigResponseBody body;

    public static DescribeComputeBurstConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComputeBurstConfigResponse self = new DescribeComputeBurstConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComputeBurstConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComputeBurstConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComputeBurstConfigResponse setBody(DescribeComputeBurstConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComputeBurstConfigResponseBody getBody() {
        return this.body;
    }

}
