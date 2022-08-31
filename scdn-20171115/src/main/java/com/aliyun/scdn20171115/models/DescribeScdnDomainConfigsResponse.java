// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainConfigsResponseBody body;

    public static DescribeScdnDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainConfigsResponse self = new DescribeScdnDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnDomainConfigsResponse setBody(DescribeScdnDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
