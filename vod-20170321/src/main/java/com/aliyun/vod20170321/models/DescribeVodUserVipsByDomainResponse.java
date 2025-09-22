// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserVipsByDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodUserVipsByDomainResponseBody body;

    public static DescribeVodUserVipsByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserVipsByDomainResponse self = new DescribeVodUserVipsByDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserVipsByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodUserVipsByDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodUserVipsByDomainResponse setBody(DescribeVodUserVipsByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodUserVipsByDomainResponseBody getBody() {
        return this.body;
    }

}
