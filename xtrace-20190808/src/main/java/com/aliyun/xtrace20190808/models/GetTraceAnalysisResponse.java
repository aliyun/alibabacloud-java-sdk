// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTraceAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTraceAnalysisResponseBody body;

    public static GetTraceAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAnalysisResponse self = new GetTraceAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public GetTraceAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTraceAnalysisResponse setBody(GetTraceAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTraceAnalysisResponseBody getBody() {
        return this.body;
    }

}
