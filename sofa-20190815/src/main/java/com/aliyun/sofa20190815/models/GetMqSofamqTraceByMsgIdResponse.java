// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqTraceByMsgIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqSofamqTraceByMsgIdResponseBody body;

    public static GetMqSofamqTraceByMsgIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqTraceByMsgIdResponse self = new GetMqSofamqTraceByMsgIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqTraceByMsgIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqSofamqTraceByMsgIdResponse setBody(GetMqSofamqTraceByMsgIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqSofamqTraceByMsgIdResponseBody getBody() {
        return this.body;
    }

}
