// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetPublicPatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublicPatchBaselineResponseBody body;

    public static GetPublicPatchBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicPatchBaselineResponse self = new GetPublicPatchBaselineResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicPatchBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicPatchBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublicPatchBaselineResponse setBody(GetPublicPatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicPatchBaselineResponseBody getBody() {
        return this.body;
    }

}
