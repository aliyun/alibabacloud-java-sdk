// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainQpsDataResponseBody body;

    public static DescribeScdnDomainQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainQpsDataResponse self = new DescribeScdnDomainQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainQpsDataResponse setBody(DescribeScdnDomainQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainQpsDataResponseBody getBody() {
        return this.body;
    }

}
