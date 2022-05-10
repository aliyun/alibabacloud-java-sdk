// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQoeMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeQoeMetricDataResponseBody body;

    public static DescribeQoeMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQoeMetricDataResponse self = new DescribeQoeMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQoeMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQoeMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQoeMetricDataResponse setBody(DescribeQoeMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQoeMetricDataResponseBody getBody() {
        return this.body;
    }

}
