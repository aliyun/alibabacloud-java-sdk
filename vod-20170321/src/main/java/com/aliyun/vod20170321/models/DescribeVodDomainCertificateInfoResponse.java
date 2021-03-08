// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVodDomainCertificateInfoResponse setBody(DescribeVodDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
