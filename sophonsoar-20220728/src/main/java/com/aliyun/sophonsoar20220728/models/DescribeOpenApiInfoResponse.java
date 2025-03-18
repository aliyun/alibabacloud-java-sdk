// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeOpenApiInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenApiInfoResponseBody body;

    public static DescribeOpenApiInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiInfoResponse self = new DescribeOpenApiInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenApiInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenApiInfoResponse setBody(DescribeOpenApiInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenApiInfoResponseBody getBody() {
        return this.body;
    }

}
