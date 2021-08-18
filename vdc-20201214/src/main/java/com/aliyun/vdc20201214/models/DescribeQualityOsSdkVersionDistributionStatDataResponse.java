// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityOsSdkVersionDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeQualityOsSdkVersionDistributionStatDataResponse setBody(DescribeQualityOsSdkVersionDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQualityOsSdkVersionDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
