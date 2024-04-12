// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeEdasContainersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEdasContainersResponseBody body;

    public static DescribeEdasContainersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdasContainersResponse self = new DescribeEdasContainersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEdasContainersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEdasContainersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEdasContainersResponse setBody(DescribeEdasContainersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdasContainersResponseBody getBody() {
        return this.body;
    }

}
