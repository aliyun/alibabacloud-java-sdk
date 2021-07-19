// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetPatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPatchBaselineResponseBody body;

    public static GetPatchBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatchBaselineResponse self = new GetPatchBaselineResponse();
        return TeaModel.build(map, self);
    }

    public GetPatchBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatchBaselineResponse setBody(GetPatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatchBaselineResponseBody getBody() {
        return this.body;
    }

}
