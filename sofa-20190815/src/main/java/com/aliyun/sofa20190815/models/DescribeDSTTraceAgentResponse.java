// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTraceAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDSTTraceAgentResponseBody body;

    public static DescribeDSTTraceAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTraceAgentResponse self = new DescribeDSTTraceAgentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTraceAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDSTTraceAgentResponse setBody(DescribeDSTTraceAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDSTTraceAgentResponseBody getBody() {
        return this.body;
    }

}
