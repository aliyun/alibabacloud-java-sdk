// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainLogResponseBody body;

    public static DescribeScdnDomainLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainLogResponse self = new DescribeScdnDomainLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainLogResponse setBody(DescribeScdnDomainLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainLogResponseBody getBody() {
        return this.body;
    }

}
