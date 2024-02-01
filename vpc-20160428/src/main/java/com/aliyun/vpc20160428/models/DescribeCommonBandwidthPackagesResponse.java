// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCommonBandwidthPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCommonBandwidthPackagesResponseBody body;

    public static DescribeCommonBandwidthPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonBandwidthPackagesResponse self = new DescribeCommonBandwidthPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommonBandwidthPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommonBandwidthPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommonBandwidthPackagesResponse setBody(DescribeCommonBandwidthPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommonBandwidthPackagesResponseBody getBody() {
        return this.body;
    }

}
