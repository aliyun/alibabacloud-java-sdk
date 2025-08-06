// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainHttpCodeDataResponseBody body;

    public static DescribeVodDomainHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainHttpCodeDataResponse self = new DescribeVodDomainHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainHttpCodeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainHttpCodeDataResponse setBody(DescribeVodDomainHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
