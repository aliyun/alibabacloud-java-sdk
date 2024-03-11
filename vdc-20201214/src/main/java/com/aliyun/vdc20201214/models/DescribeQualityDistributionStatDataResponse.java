// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQualityDistributionStatDataResponseBody body;

    public static DescribeQualityDistributionStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityDistributionStatDataResponse self = new DescribeQualityDistributionStatDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQualityDistributionStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQualityDistributionStatDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQualityDistributionStatDataResponse setBody(DescribeQualityDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQualityDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
