// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainCertificateInfoResponseBody body;

    public static DescribeVodDomainCertificateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainCertificateInfoResponse self = new DescribeVodDomainCertificateInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainCertificateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainCertificateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainCertificateInfoResponse setBody(DescribeVodDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
