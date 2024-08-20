// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainMax95BpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainMax95BpsDataResponseBody body;

    public static DescribeVodDomainMax95BpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainMax95BpsDataResponse self = new DescribeVodDomainMax95BpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainMax95BpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainMax95BpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainMax95BpsDataResponse setBody(DescribeVodDomainMax95BpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainMax95BpsDataResponseBody getBody() {
        return this.body;
    }

}
