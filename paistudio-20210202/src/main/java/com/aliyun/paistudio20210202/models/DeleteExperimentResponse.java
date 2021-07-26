// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class DeleteExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteExperimentResponseBody body;

    public static DeleteExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentResponse self = new DeleteExperimentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExperimentResponse setBody(DeleteExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperimentResponseBody getBody() {
        return this.body;
    }

}
