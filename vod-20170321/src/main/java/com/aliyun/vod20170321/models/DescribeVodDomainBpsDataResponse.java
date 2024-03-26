// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainBpsDataResponseBody body;

    public static DescribeVodDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainBpsDataResponse self = new DescribeVodDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainBpsDataResponse setBody(DescribeVodDomainBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainBpsDataResponseBody getBody() {
        return this.body;
    }

}
