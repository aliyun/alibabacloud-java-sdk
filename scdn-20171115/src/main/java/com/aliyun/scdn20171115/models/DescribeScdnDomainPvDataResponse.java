// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainPvDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainPvDataResponseBody body;

    public static DescribeScdnDomainPvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainPvDataResponse self = new DescribeScdnDomainPvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainPvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainPvDataResponse setBody(DescribeScdnDomainPvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainPvDataResponseBody getBody() {
        return this.body;
    }

}
