// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainISPDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainISPDataResponseBody body;

    public static DescribeVodDomainISPDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainISPDataResponse self = new DescribeVodDomainISPDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainISPDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainISPDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainISPDataResponse setBody(DescribeVodDomainISPDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainISPDataResponseBody getBody() {
        return this.body;
    }

}
