// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeletePublicPatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePublicPatchBaselineResponseBody body;

    public static DeletePublicPatchBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicPatchBaselineResponse self = new DeletePublicPatchBaselineResponse();
        return TeaModel.build(map, self);
    }

    public DeletePublicPatchBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePublicPatchBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePublicPatchBaselineResponse setBody(DeletePublicPatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePublicPatchBaselineResponseBody getBody() {
        return this.body;
    }

}
