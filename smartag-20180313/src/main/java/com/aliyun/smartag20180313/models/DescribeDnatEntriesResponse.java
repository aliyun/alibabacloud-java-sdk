// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeDnatEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDnatEntriesResponseBody body;

    public static DescribeDnatEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnatEntriesResponse self = new DescribeDnatEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnatEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnatEntriesResponse setBody(DescribeDnatEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnatEntriesResponseBody getBody() {
        return this.body;
    }

}
