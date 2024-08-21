// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodSSLCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodSSLCertificateListResponseBody body;

    public static DescribeVodSSLCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodSSLCertificateListResponse self = new DescribeVodSSLCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodSSLCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodSSLCertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodSSLCertificateListResponse setBody(DescribeVodSSLCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodSSLCertificateListResponseBody getBody() {
        return this.body;
    }

}
