// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelAreaDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelAreaDistributionStatDataResponseBody body;

    public static DescribeChannelAreaDistributionStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelAreaDistributionStatDataResponse self = new DescribeChannelAreaDistributionStatDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelAreaDistributionStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelAreaDistributionStatDataResponse setBody(DescribeChannelAreaDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelAreaDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
