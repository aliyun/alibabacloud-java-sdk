// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeDomainExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainExtensionsResponseBody body;

    public static DescribeDomainExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainExtensionsResponse self = new DescribeDomainExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainExtensionsResponse setBody(DescribeDomainExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainExtensionsResponseBody getBody() {
        return this.body;
    }

}
