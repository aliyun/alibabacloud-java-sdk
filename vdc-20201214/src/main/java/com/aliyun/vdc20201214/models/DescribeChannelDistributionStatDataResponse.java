// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelDistributionStatDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeChannelDistributionStatDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelDistributionStatDataResponse setBody(DescribeChannelDistributionStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelDistributionStatDataResponseBody getBody() {
        return this.body;
    }

}
