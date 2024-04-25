// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainHitRateDataResponseBody body;

    public static DescribeVodDomainHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainHitRateDataResponse self = new DescribeVodDomainHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainHitRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainHitRateDataResponse setBody(DescribeVodDomainHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainHitRateDataResponseBody getBody() {
        return this.body;
    }

}
