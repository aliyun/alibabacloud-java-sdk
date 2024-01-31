// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainListResponseBody body;

    public static DescribeDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainListResponse self = new DescribeDomainListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainListResponse setBody(DescribeDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainListResponseBody getBody() {
        return this.body;
    }

}
