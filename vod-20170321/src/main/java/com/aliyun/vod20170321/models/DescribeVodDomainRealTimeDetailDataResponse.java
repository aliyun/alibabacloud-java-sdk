// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeDetailDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainRealTimeDetailDataResponseBody body;

    public static DescribeVodDomainRealTimeDetailDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeDetailDataResponse self = new DescribeVodDomainRealTimeDetailDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeDetailDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainRealTimeDetailDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainRealTimeDetailDataResponse setBody(DescribeVodDomainRealTimeDetailDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRealTimeDetailDataResponseBody getBody() {
        return this.body;
    }

}
