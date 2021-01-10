// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateABTestExperimentResponseBody body;

    public static CreateABTestExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestExperimentResponse self = new CreateABTestExperimentResponse();
        return TeaModel.build(map, self);
    }

    public CreateABTestExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateABTestExperimentResponse setBody(CreateABTestExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateABTestExperimentResponseBody getBody() {
        return this.body;
    }

}
