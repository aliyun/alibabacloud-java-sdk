// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PublishExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishExperimentResponseBody body;

    public static PublishExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishExperimentResponse self = new PublishExperimentResponse();
        return TeaModel.build(map, self);
    }

    public PublishExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishExperimentResponse setBody(PublishExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishExperimentResponseBody getBody() {
        return this.body;
    }

}
