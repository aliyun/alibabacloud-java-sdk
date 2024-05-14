// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainBasicConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainBasicConfigsResponseBody body;

    public static DescribeDomainBasicConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBasicConfigsResponse self = new DescribeDomainBasicConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBasicConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainBasicConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainBasicConfigsResponse setBody(DescribeDomainBasicConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainBasicConfigsResponseBody getBody() {
        return this.body;
    }

}
