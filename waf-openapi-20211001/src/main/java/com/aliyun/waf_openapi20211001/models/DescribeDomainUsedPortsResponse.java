// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainUsedPortsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainUsedPortsResponseBody body;

    public static DescribeDomainUsedPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainUsedPortsResponse self = new DescribeDomainUsedPortsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainUsedPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainUsedPortsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainUsedPortsResponse setBody(DescribeDomainUsedPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainUsedPortsResponseBody getBody() {
        return this.body;
    }

}
