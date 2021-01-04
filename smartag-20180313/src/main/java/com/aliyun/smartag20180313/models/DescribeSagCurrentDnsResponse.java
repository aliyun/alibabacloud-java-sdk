// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagCurrentDnsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagCurrentDnsResponseBody body;

    public static DescribeSagCurrentDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagCurrentDnsResponse self = new DescribeSagCurrentDnsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagCurrentDnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagCurrentDnsResponse setBody(DescribeSagCurrentDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagCurrentDnsResponseBody getBody() {
        return this.body;
    }

}
