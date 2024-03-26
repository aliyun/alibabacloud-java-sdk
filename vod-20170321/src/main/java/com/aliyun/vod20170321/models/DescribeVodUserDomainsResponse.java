// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodUserDomainsResponseBody body;

    public static DescribeVodUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserDomainsResponse self = new DescribeVodUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodUserDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodUserDomainsResponse setBody(DescribeVodUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodUserDomainsResponseBody getBody() {
        return this.body;
    }

}
