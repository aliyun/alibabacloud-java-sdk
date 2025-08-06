// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTopReferVisitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainTopReferVisitResponseBody body;

    public static DescribeVodDomainTopReferVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTopReferVisitResponse self = new DescribeVodDomainTopReferVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainTopReferVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainTopReferVisitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainTopReferVisitResponse setBody(DescribeVodDomainTopReferVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainTopReferVisitResponseBody getBody() {
        return this.body;
    }

}
