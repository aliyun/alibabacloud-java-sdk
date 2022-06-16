// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppEnvironmentDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppEnvironmentDetailResponseBody body;

    public static DescribeAppEnvironmentDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvironmentDetailResponse self = new DescribeAppEnvironmentDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvironmentDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppEnvironmentDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppEnvironmentDetailResponse setBody(DescribeAppEnvironmentDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppEnvironmentDetailResponseBody getBody() {
        return this.body;
    }

}
