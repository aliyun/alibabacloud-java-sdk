// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetCallsPerDayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCallsPerDayResponseBody body;

    public static GetCallsPerDayResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallsPerDayResponse self = new GetCallsPerDayResponse();
        return TeaModel.build(map, self);
    }

    public GetCallsPerDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallsPerDayResponse setBody(GetCallsPerDayResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallsPerDayResponseBody getBody() {
        return this.body;
    }

}
