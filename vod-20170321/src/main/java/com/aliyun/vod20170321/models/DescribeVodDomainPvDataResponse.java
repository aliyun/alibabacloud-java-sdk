// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainPvDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainPvDataResponseBody body;

    public static DescribeVodDomainPvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainPvDataResponse self = new DescribeVodDomainPvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainPvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainPvDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainPvDataResponse setBody(DescribeVodDomainPvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainPvDataResponseBody getBody() {
        return this.body;
    }

}
