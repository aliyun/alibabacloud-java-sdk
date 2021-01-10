// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDSTTraceResponseBody body;

    public static DescribeDSTTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTraceResponse self = new DescribeDSTTraceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDSTTraceResponse setBody(DescribeDSTTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDSTTraceResponseBody getBody() {
        return this.body;
    }

}
