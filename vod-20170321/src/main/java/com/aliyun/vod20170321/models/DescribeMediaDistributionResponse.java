// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeMediaDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMediaDistributionResponseBody body;

    public static DescribeMediaDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMediaDistributionResponse self = new DescribeMediaDistributionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMediaDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMediaDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMediaDistributionResponse setBody(DescribeMediaDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMediaDistributionResponseBody getBody() {
        return this.body;
    }

}
