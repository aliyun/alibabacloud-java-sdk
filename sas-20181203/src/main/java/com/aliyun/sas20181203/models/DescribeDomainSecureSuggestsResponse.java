// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureSuggestsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSecureSuggestsResponseBody body;

    public static DescribeDomainSecureSuggestsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureSuggestsResponse self = new DescribeDomainSecureSuggestsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureSuggestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSecureSuggestsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSecureSuggestsResponse setBody(DescribeDomainSecureSuggestsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSecureSuggestsResponseBody getBody() {
        return this.body;
    }

}
