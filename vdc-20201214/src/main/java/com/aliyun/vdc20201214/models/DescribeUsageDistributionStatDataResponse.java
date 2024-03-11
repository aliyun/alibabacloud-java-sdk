// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUsageDistributionStatDataResponseBody body;

    public static DescribeUsageDistributionStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageDistributionStatDataResponse self = new DescribeUsageDistributionStatDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsageDistributionStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsageDistributionStatDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUsageDistributionStatDataResponse setBody(DescribeUsageDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsageDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
