// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnUserQuotaResponseBody body;

    public static DescribeScdnUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnUserQuotaResponse self = new DescribeScdnUserQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnUserQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnUserQuotaResponse setBody(DescribeScdnUserQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnUserQuotaResponseBody getBody() {
        return this.body;
    }

}
