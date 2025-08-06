// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainsUsageByDayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainsUsageByDayResponseBody body;

    public static DescribeVodDomainsUsageByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainsUsageByDayResponse self = new DescribeVodDomainsUsageByDayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainsUsageByDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainsUsageByDayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainsUsageByDayResponse setBody(DescribeVodDomainsUsageByDayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainsUsageByDayResponseBody getBody() {
        return this.body;
    }

}
