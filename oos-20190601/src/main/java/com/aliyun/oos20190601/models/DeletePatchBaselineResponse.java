// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeletePatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePatchBaselineResponseBody body;

    public static DeletePatchBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePatchBaselineResponse self = new DeletePatchBaselineResponse();
        return TeaModel.build(map, self);
    }

    public DeletePatchBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePatchBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePatchBaselineResponse setBody(DeletePatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePatchBaselineResponseBody getBody() {
        return this.body;
    }

}
