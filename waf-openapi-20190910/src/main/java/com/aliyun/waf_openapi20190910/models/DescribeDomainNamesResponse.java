// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainNamesResponseBody body;

    public static DescribeDomainNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNamesResponse self = new DescribeDomainNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainNamesResponse setBody(DescribeDomainNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainNamesResponseBody getBody() {
        return this.body;
    }

}
