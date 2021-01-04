// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagHaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagHaResponseBody body;

    public static DescribeSagHaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagHaResponse self = new DescribeSagHaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagHaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagHaResponse setBody(DescribeSagHaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagHaResponseBody getBody() {
        return this.body;
    }

}
