// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTraceTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDSTTraceTreeResponseBody body;

    public static DescribeDSTTraceTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTraceTreeResponse self = new DescribeDSTTraceTreeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTraceTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDSTTraceTreeResponse setBody(DescribeDSTTraceTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDSTTraceTreeResponseBody getBody() {
        return this.body;
    }

}
