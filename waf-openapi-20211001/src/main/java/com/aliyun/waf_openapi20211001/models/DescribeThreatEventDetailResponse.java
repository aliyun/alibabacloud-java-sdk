// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeThreatEventDetailResponseBody body;

    public static DescribeThreatEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeThreatEventDetailResponse self = new DescribeThreatEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeThreatEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeThreatEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeThreatEventDetailResponse setBody(DescribeThreatEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeThreatEventDetailResponseBody getBody() {
        return this.body;
    }

}
