// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageOverallDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUsageOverallDataResponseBody body;

    public static DescribeUsageOverallDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageOverallDataResponse self = new DescribeUsageOverallDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsageOverallDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsageOverallDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUsageOverallDataResponse setBody(DescribeUsageOverallDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsageOverallDataResponseBody getBody() {
        return this.body;
    }

}
