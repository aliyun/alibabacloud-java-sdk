// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainCountResponseBody body;

    public static DescribeDomainCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCountResponse self = new DescribeDomainCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainCountResponse setBody(DescribeDomainCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainCountResponseBody getBody() {
        return this.body;
    }

}
