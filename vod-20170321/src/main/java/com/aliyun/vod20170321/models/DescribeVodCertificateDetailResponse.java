// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodCertificateDetailResponseBody body;

    public static DescribeVodCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodCertificateDetailResponse self = new DescribeVodCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodCertificateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodCertificateDetailResponse setBody(DescribeVodCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
