// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMonitorListResponseBody body;

    public static GetMonitorListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorListResponse self = new GetMonitorListResponse();
        return TeaModel.build(map, self);
    }

    public GetMonitorListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonitorListResponse setBody(GetMonitorListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMonitorListResponseBody getBody() {
        return this.body;
    }

}
