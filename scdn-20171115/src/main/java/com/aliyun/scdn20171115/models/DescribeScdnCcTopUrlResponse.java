// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCcTopUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnCcTopUrlResponseBody body;

    public static DescribeScdnCcTopUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCcTopUrlResponse self = new DescribeScdnCcTopUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCcTopUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnCcTopUrlResponse setBody(DescribeScdnCcTopUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnCcTopUrlResponseBody getBody() {
        return this.body;
    }

}
