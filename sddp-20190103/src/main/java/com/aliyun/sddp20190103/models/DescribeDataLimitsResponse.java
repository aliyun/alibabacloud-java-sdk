// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataLimitsResponseBody body;

    public static DescribeDataLimitsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitsResponse self = new DescribeDataLimitsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataLimitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataLimitsResponse setBody(DescribeDataLimitsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataLimitsResponseBody getBody() {
        return this.body;
    }

}
