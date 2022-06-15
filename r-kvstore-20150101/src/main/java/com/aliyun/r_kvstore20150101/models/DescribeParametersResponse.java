// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeParametersResponseBody body;

    public static DescribeParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponse self = new DescribeParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParametersResponse setBody(DescribeParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParametersResponseBody getBody() {
        return this.body;
    }

}
