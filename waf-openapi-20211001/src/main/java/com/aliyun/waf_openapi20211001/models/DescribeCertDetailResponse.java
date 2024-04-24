// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCertDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCertDetailResponseBody body;

    public static DescribeCertDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertDetailResponse self = new DescribeCertDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCertDetailResponse setBody(DescribeCertDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertDetailResponseBody getBody() {
        return this.body;
    }

}
