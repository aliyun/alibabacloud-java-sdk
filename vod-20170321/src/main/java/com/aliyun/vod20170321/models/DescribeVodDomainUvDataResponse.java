// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUvDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainUvDataResponseBody body;

    public static DescribeVodDomainUvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainUvDataResponse self = new DescribeVodDomainUvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainUvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainUvDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainUvDataResponse setBody(DescribeVodDomainUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainUvDataResponseBody getBody() {
        return this.body;
    }

}
