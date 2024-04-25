// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainRealTimeBpsDataResponseBody body;

    public static DescribeVodDomainRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeBpsDataResponse self = new DescribeVodDomainRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainRealTimeBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainRealTimeBpsDataResponse setBody(DescribeVodDomainRealTimeBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRealTimeBpsDataResponseBody getBody() {
        return this.body;
    }

}
