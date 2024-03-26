// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainConfigsResponseBody body;

    public static DescribeVodDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainConfigsResponse self = new DescribeVodDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainConfigsResponse setBody(DescribeVodDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
