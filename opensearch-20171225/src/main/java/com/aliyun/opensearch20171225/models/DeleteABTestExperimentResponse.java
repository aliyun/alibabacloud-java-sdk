// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteABTestExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteABTestExperimentResponseBody body;

    public static DeleteABTestExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteABTestExperimentResponse self = new DeleteABTestExperimentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteABTestExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteABTestExperimentResponse setBody(DeleteABTestExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteABTestExperimentResponseBody getBody() {
        return this.body;
    }

}
