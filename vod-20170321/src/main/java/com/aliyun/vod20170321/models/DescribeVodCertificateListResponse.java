// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodCertificateListResponseBody body;

    public static DescribeVodCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodCertificateListResponse self = new DescribeVodCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodCertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodCertificateListResponse setBody(DescribeVodCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodCertificateListResponseBody getBody() {
        return this.body;
    }

}
