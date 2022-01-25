// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobInfoResponseBody body;

    public static GetJobInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobInfoResponse self = new GetJobInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetJobInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobInfoResponse setBody(GetJobInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobInfoResponseBody getBody() {
        return this.body;
    }

}
