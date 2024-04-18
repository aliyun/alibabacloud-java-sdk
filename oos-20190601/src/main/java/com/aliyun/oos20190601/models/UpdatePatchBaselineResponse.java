// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdatePatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePatchBaselineResponseBody body;

    public static UpdatePatchBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePatchBaselineResponse self = new UpdatePatchBaselineResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePatchBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePatchBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePatchBaselineResponse setBody(UpdatePatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePatchBaselineResponseBody getBody() {
        return this.body;
    }

}
