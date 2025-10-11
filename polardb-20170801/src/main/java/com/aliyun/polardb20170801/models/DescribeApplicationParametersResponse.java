// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationParametersResponseBody body;

    public static DescribeApplicationParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationParametersResponse self = new DescribeApplicationParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationParametersResponse setBody(DescribeApplicationParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationParametersResponseBody getBody() {
        return this.body;
    }

}
