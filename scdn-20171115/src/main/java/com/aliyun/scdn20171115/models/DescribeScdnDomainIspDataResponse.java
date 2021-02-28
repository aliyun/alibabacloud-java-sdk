// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainIspDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainIspDataResponseBody body;

    public static DescribeScdnDomainIspDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainIspDataResponse self = new DescribeScdnDomainIspDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainIspDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainIspDataResponse setBody(DescribeScdnDomainIspDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainIspDataResponseBody getBody() {
        return this.body;
    }

}
