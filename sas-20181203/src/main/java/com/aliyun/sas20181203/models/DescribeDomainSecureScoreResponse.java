// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureScoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSecureScoreResponseBody body;

    public static DescribeDomainSecureScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureScoreResponse self = new DescribeDomainSecureScoreResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureScoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSecureScoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSecureScoreResponse setBody(DescribeDomainSecureScoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSecureScoreResponseBody getBody() {
        return this.body;
    }

}
