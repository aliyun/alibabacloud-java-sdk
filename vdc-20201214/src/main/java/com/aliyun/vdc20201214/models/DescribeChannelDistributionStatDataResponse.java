// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelDistributionStatDataResponseBody body;

    public static DescribeChannelDistributionStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelDistributionStatDataResponse self = new DescribeChannelDistributionStatDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelDistributionStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelDistributionStatDataResponse setBody(DescribeChannelDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
