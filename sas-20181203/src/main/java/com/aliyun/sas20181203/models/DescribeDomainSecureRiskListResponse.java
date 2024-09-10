// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureRiskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSecureRiskListResponseBody body;

    public static DescribeDomainSecureRiskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureRiskListResponse self = new DescribeDomainSecureRiskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureRiskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSecureRiskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSecureRiskListResponse setBody(DescribeDomainSecureRiskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSecureRiskListResponseBody getBody() {
        return this.body;
    }

}
