// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainUvDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainUvDataResponseBody body;

    public static DescribeScdnDomainUvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainUvDataResponse self = new DescribeScdnDomainUvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainUvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainUvDataResponse setBody(DescribeScdnDomainUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainUvDataResponseBody getBody() {
        return this.body;
    }

}
