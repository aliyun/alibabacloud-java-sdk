// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetUnionTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUnionTaskStatusResponseBody body;

    public static GetUnionTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnionTaskStatusResponse self = new GetUnionTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetUnionTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUnionTaskStatusResponse setBody(GetUnionTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUnionTaskStatusResponseBody getBody() {
        return this.body;
    }

}
