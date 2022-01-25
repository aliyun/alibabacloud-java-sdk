// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobInstanceResponseBody body;

    public static GetJobInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceResponse self = new GetJobInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobInstanceResponse setBody(GetJobInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobInstanceResponseBody getBody() {
        return this.body;
    }

}
