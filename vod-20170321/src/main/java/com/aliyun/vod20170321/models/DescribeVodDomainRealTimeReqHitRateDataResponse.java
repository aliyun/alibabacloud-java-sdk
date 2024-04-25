// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeReqHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainRealTimeReqHitRateDataResponseBody body;

    public static DescribeVodDomainRealTimeReqHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeReqHitRateDataResponse self = new DescribeVodDomainRealTimeReqHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeReqHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainRealTimeReqHitRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainRealTimeReqHitRateDataResponse setBody(DescribeVodDomainRealTimeReqHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRealTimeReqHitRateDataResponseBody getBody() {
        return this.body;
    }

}
