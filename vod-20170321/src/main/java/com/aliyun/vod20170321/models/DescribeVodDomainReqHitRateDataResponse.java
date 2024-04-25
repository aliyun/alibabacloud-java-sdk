// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainReqHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainReqHitRateDataResponseBody body;

    public static DescribeVodDomainReqHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainReqHitRateDataResponse self = new DescribeVodDomainReqHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainReqHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainReqHitRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainReqHitRateDataResponse setBody(DescribeVodDomainReqHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainReqHitRateDataResponseBody getBody() {
        return this.body;
    }

}
