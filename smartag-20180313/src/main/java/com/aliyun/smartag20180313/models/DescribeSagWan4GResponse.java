// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWan4GResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagWan4GResponseBody body;

    public static DescribeSagWan4GResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWan4GResponse self = new DescribeSagWan4GResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagWan4GResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagWan4GResponse setBody(DescribeSagWan4GResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagWan4GResponseBody getBody() {
        return this.body;
    }

}
