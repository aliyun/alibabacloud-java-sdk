// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class UpdatePublicPatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePublicPatchBaselineResponseBody body;

    public static UpdatePublicPatchBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicPatchBaselineResponse self = new UpdatePublicPatchBaselineResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublicPatchBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublicPatchBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublicPatchBaselineResponse setBody(UpdatePublicPatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublicPatchBaselineResponseBody getBody() {
        return this.body;
    }

}
