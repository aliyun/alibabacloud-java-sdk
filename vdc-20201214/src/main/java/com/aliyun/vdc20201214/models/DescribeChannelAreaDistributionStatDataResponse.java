// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelAreaDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeChannelAreaDistributionStatDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelAreaDistributionStatDataResponse setBody(DescribeChannelAreaDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelAreaDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
