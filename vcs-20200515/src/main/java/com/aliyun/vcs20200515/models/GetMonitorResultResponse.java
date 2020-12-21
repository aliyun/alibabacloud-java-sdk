// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMonitorResultResponseBody body;

    public static GetMonitorResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorResultResponse self = new GetMonitorResultResponse();
        return TeaModel.build(map, self);
    }

    public GetMonitorResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonitorResultResponse setBody(GetMonitorResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMonitorResultResponseBody getBody() {
        return this.body;
    }

}
