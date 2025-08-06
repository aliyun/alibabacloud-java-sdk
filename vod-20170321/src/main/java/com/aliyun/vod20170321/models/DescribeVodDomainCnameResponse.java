// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainCnameResponseBody body;

    public static DescribeVodDomainCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainCnameResponse self = new DescribeVodDomainCnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainCnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainCnameResponse setBody(DescribeVodDomainCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainCnameResponseBody getBody() {
        return this.body;
    }

}
