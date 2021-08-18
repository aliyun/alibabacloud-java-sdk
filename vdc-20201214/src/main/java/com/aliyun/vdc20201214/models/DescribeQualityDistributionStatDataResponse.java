// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeQualityDistributionStatDataResponse setBody(DescribeQualityDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQualityDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
