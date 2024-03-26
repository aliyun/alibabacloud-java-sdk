// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainSrcTrafficDataResponseBody body;

    public static DescribeVodDomainSrcTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainSrcTrafficDataResponse self = new DescribeVodDomainSrcTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainSrcTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainSrcTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainSrcTrafficDataResponse setBody(DescribeVodDomainSrcTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainSrcTrafficDataResponseBody getBody() {
        return this.body;
    }

}
