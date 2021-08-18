// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityAreaDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeQualityAreaDistributionStatDataResponseBody body;

    public static DescribeQualityAreaDistributionStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityAreaDistributionStatDataResponse self = new DescribeQualityAreaDistributionStatDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQualityAreaDistributionStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQualityAreaDistributionStatDataResponse setBody(DescribeQualityAreaDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQualityAreaDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
