// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTopUrlVisitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainTopUrlVisitResponseBody body;

    public static DescribeVodDomainTopUrlVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTopUrlVisitResponse self = new DescribeVodDomainTopUrlVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainTopUrlVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainTopUrlVisitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainTopUrlVisitResponse setBody(DescribeVodDomainTopUrlVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainTopUrlVisitResponseBody getBody() {
        return this.body;
    }

}
