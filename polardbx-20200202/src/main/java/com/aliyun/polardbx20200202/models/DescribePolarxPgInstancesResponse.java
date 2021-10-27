// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePolarxPgInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolarxPgInstancesResponseBody body;

    public static DescribePolarxPgInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarxPgInstancesResponse self = new DescribePolarxPgInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarxPgInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarxPgInstancesResponse setBody(DescribePolarxPgInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarxPgInstancesResponseBody getBody() {
        return this.body;
    }

}
