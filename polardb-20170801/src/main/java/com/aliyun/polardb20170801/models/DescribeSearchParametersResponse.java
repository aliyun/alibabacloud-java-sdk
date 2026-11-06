// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSearchParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSearchParametersResponseBody body;

    public static DescribeSearchParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchParametersResponse self = new DescribeSearchParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSearchParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSearchParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSearchParametersResponse setBody(DescribeSearchParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSearchParametersResponseBody getBody() {
        return this.body;
    }

}
