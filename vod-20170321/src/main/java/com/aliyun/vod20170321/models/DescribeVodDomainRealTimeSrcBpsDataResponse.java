// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeSrcBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainRealTimeSrcBpsDataResponseBody body;

    public static DescribeVodDomainRealTimeSrcBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeSrcBpsDataResponse self = new DescribeVodDomainRealTimeSrcBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeSrcBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainRealTimeSrcBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainRealTimeSrcBpsDataResponse setBody(DescribeVodDomainRealTimeSrcBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRealTimeSrcBpsDataResponseBody getBody() {
        return this.body;
    }

}
