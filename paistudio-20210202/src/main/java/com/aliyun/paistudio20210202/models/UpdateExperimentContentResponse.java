// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExperimentContentResponseBody body;

    public static UpdateExperimentContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentContentResponse self = new UpdateExperimentContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentContentResponse setBody(UpdateExperimentContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentContentResponseBody getBody() {
        return this.body;
    }

}
