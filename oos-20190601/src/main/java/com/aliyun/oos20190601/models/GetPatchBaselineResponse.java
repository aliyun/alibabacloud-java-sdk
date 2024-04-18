// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetPatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetPatchBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPatchBaselineResponse setBody(GetPatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatchBaselineResponseBody getBody() {
        return this.body;
    }

}
