// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageAreaDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUsageAreaDistributionStatDataResponseBody body;

    public static DescribeUsageAreaDistributionStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageAreaDistributionStatDataResponse self = new DescribeUsageAreaDistributionStatDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsageAreaDistributionStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsageAreaDistributionStatDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUsageAreaDistributionStatDataResponse setBody(DescribeUsageAreaDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsageAreaDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
