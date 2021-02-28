// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainHttpCodeDataResponseBody body;

    public static DescribeScdnDomainHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainHttpCodeDataResponse self = new DescribeScdnDomainHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainHttpCodeDataResponse setBody(DescribeScdnDomainHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
