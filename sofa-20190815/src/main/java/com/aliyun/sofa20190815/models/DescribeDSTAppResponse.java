// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDSTAppResponseBody body;

    public static DescribeDSTAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTAppResponse self = new DescribeDSTAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDSTAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDSTAppResponse setBody(DescribeDSTAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDSTAppResponseBody getBody() {
        return this.body;
    }

}
