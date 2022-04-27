// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class GetJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobStatusResponseBody body;

    public static GetJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusResponse self = new GetJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobStatusResponse setBody(GetJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobStatusResponseBody getBody() {
        return this.body;
    }

}
