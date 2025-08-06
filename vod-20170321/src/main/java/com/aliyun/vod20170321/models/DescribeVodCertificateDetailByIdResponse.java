// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodCertificateDetailByIdResponseBody body;

    public static DescribeVodCertificateDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodCertificateDetailByIdResponse self = new DescribeVodCertificateDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodCertificateDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodCertificateDetailByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodCertificateDetailByIdResponse setBody(DescribeVodCertificateDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodCertificateDetailByIdResponseBody getBody() {
        return this.body;
    }

}
