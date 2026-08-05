// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DescribeCapabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCapabilityResponseBody body;

    public static DescribeCapabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapabilityResponse self = new DescribeCapabilityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCapabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCapabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCapabilityResponse setBody(DescribeCapabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCapabilityResponseBody getBody() {
        return this.body;
    }

}
