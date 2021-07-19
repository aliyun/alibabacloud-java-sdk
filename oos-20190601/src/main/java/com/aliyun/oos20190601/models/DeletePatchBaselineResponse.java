// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeletePatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeletePatchBaselineResponse setBody(DeletePatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePatchBaselineResponseBody getBody() {
        return this.body;
    }

}
