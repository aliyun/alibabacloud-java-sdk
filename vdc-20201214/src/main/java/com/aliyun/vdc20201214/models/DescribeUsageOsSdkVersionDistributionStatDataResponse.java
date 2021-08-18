// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageOsSdkVersionDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUsageOsSdkVersionDistributionStatDataResponseBody body;

    public static DescribeUsageOsSdkVersionDistributionStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageOsSdkVersionDistributionStatDataResponse self = new DescribeUsageOsSdkVersionDistributionStatDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsageOsSdkVersionDistributionStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsageOsSdkVersionDistributionStatDataResponse setBody(DescribeUsageOsSdkVersionDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsageOsSdkVersionDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
