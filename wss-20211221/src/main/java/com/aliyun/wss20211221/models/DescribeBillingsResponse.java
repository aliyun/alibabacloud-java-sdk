// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeBillingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBillingsResponseBody body;

    public static DescribeBillingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBillingsResponse self = new DescribeBillingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBillingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBillingsResponse setBody(DescribeBillingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBillingsResponseBody getBody() {
        return this.body;
    }

}
