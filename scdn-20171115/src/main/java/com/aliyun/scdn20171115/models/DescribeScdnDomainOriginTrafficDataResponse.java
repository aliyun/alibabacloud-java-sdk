// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainOriginTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainOriginTrafficDataResponseBody body;

    public static DescribeScdnDomainOriginTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainOriginTrafficDataResponse self = new DescribeScdnDomainOriginTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainOriginTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainOriginTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnDomainOriginTrafficDataResponse setBody(DescribeScdnDomainOriginTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainOriginTrafficDataResponseBody getBody() {
        return this.body;
    }

}
