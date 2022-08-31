// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainCnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainCnameResponseBody body;

    public static DescribeScdnDomainCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainCnameResponse self = new DescribeScdnDomainCnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainCnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnDomainCnameResponse setBody(DescribeScdnDomainCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainCnameResponseBody getBody() {
        return this.body;
    }

}
