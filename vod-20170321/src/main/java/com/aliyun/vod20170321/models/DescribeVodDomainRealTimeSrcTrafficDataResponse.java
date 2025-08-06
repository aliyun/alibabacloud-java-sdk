// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeSrcTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainRealTimeSrcTrafficDataResponseBody body;

    public static DescribeVodDomainRealTimeSrcTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeSrcTrafficDataResponse self = new DescribeVodDomainRealTimeSrcTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeSrcTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainRealTimeSrcTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainRealTimeSrcTrafficDataResponse setBody(DescribeVodDomainRealTimeSrcTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRealTimeSrcTrafficDataResponseBody getBody() {
        return this.body;
    }

}
