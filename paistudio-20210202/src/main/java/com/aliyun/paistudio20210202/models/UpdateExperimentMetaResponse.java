// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExperimentMetaResponseBody body;

    public static UpdateExperimentMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentMetaResponse self = new UpdateExperimentMetaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentMetaResponse setBody(UpdateExperimentMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentMetaResponseBody getBody() {
        return this.body;
    }

}
