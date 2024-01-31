// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityOsSdkVersionDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQualityOsSdkVersionDistributionStatDataResponseBody body;

    public static DescribeQualityOsSdkVersionDistributionStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityOsSdkVersionDistributionStatDataResponse self = new DescribeQualityOsSdkVersionDistributionStatDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQualityOsSdkVersionDistributionStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQualityOsSdkVersionDistributionStatDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQualityOsSdkVersionDistributionStatDataResponse setBody(DescribeQualityOsSdkVersionDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQualityOsSdkVersionDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
