// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainTrafficDataResponseBody body;

    public static DescribeVodDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTrafficDataResponse self = new DescribeVodDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainTrafficDataResponse setBody(DescribeVodDomainTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainTrafficDataResponseBody getBody() {
        return this.body;
    }

}
