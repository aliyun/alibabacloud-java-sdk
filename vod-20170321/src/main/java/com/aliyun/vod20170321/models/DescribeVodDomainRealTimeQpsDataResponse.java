// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainRealTimeQpsDataResponseBody body;

    public static DescribeVodDomainRealTimeQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeQpsDataResponse self = new DescribeVodDomainRealTimeQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainRealTimeQpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainRealTimeQpsDataResponse setBody(DescribeVodDomainRealTimeQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRealTimeQpsDataResponseBody getBody() {
        return this.body;
    }

}
