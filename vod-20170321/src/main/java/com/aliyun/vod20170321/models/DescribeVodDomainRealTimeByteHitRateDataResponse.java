// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeByteHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainRealTimeByteHitRateDataResponseBody body;

    public static DescribeVodDomainRealTimeByteHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeByteHitRateDataResponse self = new DescribeVodDomainRealTimeByteHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeByteHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainRealTimeByteHitRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainRealTimeByteHitRateDataResponse setBody(DescribeVodDomainRealTimeByteHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRealTimeByteHitRateDataResponseBody getBody() {
        return this.body;
    }

}
