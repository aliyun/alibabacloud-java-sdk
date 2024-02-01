// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionLOAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhysicalConnectionLOAResponseBody body;

    public static DescribePhysicalConnectionLOAResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionLOAResponse self = new DescribePhysicalConnectionLOAResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionLOAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhysicalConnectionLOAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhysicalConnectionLOAResponse setBody(DescribePhysicalConnectionLOAResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhysicalConnectionLOAResponseBody getBody() {
        return this.body;
    }

}
