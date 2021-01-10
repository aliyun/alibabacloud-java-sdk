// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqTraceResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqSofamqTraceResultResponseBody body;

    public static GetMqSofamqTraceResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqTraceResultResponse self = new GetMqSofamqTraceResultResponse();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqTraceResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqSofamqTraceResultResponse setBody(GetMqSofamqTraceResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqSofamqTraceResultResponseBody getBody() {
        return this.body;
    }

}
