// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainDetailResponseBody body;

    public static DescribeVodDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainDetailResponse self = new DescribeVodDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainDetailResponse setBody(DescribeVodDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainDetailResponseBody getBody() {
        return this.body;
    }

}
